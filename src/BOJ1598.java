import java.io.*;
import java.util.StringTokenizer;

public class BOJ1598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] ground = new int[4][];

        for(int j = 0; j < (a > b ? a / 4: b / 4); j++) {
            for(int i = 0; i < 4; i++) {
                ground[i][j] = 1;
            }
        }
     //System.out.println(ground[3][22]);

    }
}
