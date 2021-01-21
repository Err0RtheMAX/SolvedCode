import java.io.*;
import java.util.StringTokenizer;

public class BOJ1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i = m; i <= n; i++) {
            if(i != 2 && (i % 2 == 0) || i == 1)
                continue;

            for(int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j)
                    break;

                else if (i == j) {
                    bw.write(String.valueOf(i));
                    bw.flush();
                    bw.newLine();
                }

            }

        }

        br.close();
        bw.close();
    }
}
