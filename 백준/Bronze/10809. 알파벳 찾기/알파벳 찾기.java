import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String word = br.readLine();  //단어 입력
        int[] site = new int[26];

        for (int i = 0; i < 26; i++) {
            site[i] = -1;
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            countWord(i, ch, site);
        }

        for (int i = 0; i < 26; i++) {
            sb.append(site[i]).append(" ");
        }

        System.out.println(sb);
    }

    public static void countWord(int idx, char ch, int[] arr) {
        switch (ch) {
            case 'a':
                if (arr[0] == -1) arr[0] = idx;
                break;
            case 'b':
                if (arr[1] == -1) arr[1] = idx;
                break;
            case 'c':
                if (arr[2] == -1) arr[2] = idx;
                break;
            case 'd':
                if (arr[3] == -1) arr[3] = idx;
                break;
            case 'e':
                if (arr[4] == -1) arr[4] = idx;
                break;
            case 'f':
                if (arr[5] == -1) arr[5] = idx;
                break;
            case 'g':
                if (arr[6] == -1) arr[6] = idx;
                break;
            case 'h':
                if (arr[7] == -1) arr[7] = idx;
                break;
            case 'i':
                if (arr[8] == -1) arr[8] = idx;
                break;
            case 'j':
                if (arr[9] == -1) arr[9] = idx;
                break;
            case 'k':
                if (arr[10] == -1) arr[10] = idx;
                break;
            case 'l':
                if (arr[11] == -1) arr[11] = idx;
                break;
            case 'm':
                if (arr[12] == -1) arr[12] = idx;
                break;
            case 'n':
                if (arr[13] == -1) arr[13] = idx;
                break;
            case 'o':
                if (arr[14] == -1) arr[14] = idx;
                break;
            case 'p':
                if (arr[15] == -1) arr[15] = idx;
                break;
            case 'q':
                if (arr[16] == -1) arr[16] = idx;
                break;
            case 'r':
                if (arr[17] == -1) arr[17] = idx;
                break;
            case 's':
                if (arr[18] == -1) arr[18] = idx;
                break;
            case 't':
                if (arr[19] == -1) arr[19] = idx;
                break;
            case 'u':
                if (arr[20] == -1) arr[20] = idx;
                break;
            case 'v':
                if (arr[21] == -1) arr[21] = idx;
                break;
            case 'w':
                if (arr[22] == -1) arr[22] = idx;
                break;
            case 'x':
                if (arr[23] == -1) arr[23] = idx;
                break;
            case 'y':
                if (arr[24] == -1) arr[24] = idx;
                break;
            case 'z':
                if (arr[25] == -1) arr[25] = idx;
                break;
            default: break;
        }
    }
}
