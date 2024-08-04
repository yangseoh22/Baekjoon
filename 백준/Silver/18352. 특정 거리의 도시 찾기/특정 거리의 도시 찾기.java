import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Node implements Comparable<Node>{
        int vertex;
        int weight;

        Node(int v, int w){
            this.vertex = v;
            this.weight = w;
        }

        public int compareTo(Node other){ return this.weight - other.weight; }
    }

    public static int[] dijkstra(int V, List<List<Node>> graph, int start){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        int[] dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        pq.add(new Node(start, 0));

        while(!pq.isEmpty()){
            Node cur = pq.poll();
            int curNode = cur.vertex;

            for(Node neighbor : graph.get(curNode)){
                int newDist = dist[curNode] + neighbor.weight;

                if (newDist < dist[neighbor.vertex]){
                    dist[neighbor.vertex] = newDist;
                    pq.add(new Node(neighbor.vertex, newDist));
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());  //도시 개수
        int M = Integer.parseInt(st.nextToken());  //도로 개수
        int K = Integer.parseInt(st.nextToken());  //거리 정보
        int X = Integer.parseInt(st.nextToken());  //출발 도시 번호

        //그래프 초기화
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        //간선 입력
        for(int i = 0; i<M;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());  //시작 노드
            int y = Integer.parseInt(st.nextToken());  //끝 노드
            graph.get(x).add(new Node(y, 1));  //가중치는 모두 1
        }

        //다익스트라 실행
        int[] distances = dijkstra(N, graph, X);

        List<Integer> result = new ArrayList<>();
        //거리 K인 도시를 결과에 추가
        for (int i = 1; i <= N; i++) {
            if (distances[i] == K) {
                result.add(i);
            }
        }

        // 결과 출력
        if (result.isEmpty()) {  //만족하는 경우가 없으면 -1 출력
            sb.append(-1);
        } else {
            Collections.sort(result);  //오름차순 정렬
            for (int city : result) {  //정렬 순으로 출력
                sb.append(city).append("\n");
            }
        }

        System.out.println(sb);
    }
}