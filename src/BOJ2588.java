import java.io.*;
import java.util.StringTokenizer;

public class BOJ2588 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(a * (b % 10)));
        bw.newLine();
        bw.write(String.valueOf(a * (b - (b - (b % 100)) - (b % 10)) / 10));
        System.out.println(a * (b - (b % 100)) / 100);
        bw.newLine();
        bw.write(String.valueOf(a * b));
        bw.newLine();

        br.close();
        bw.close();

    }
}
