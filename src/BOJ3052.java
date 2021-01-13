import java.io.*;

public class BOJ3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] num = new int[10];
        int count = 0;
        int[] input = new int[10];
        int count2 = 0;

        for(int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(br.readLine());
            num[i] %= 42;
        }

        for(int i = 0; i < num.length - 1; i++) {
            for(int j = i + 1 ; j < num.length; j++) {
                if(input[j] == num[i]) {
                    count += 1;
                }

                if(count != 0)
                    count2 += 1;
            }
        }

        bw.write(String.valueOf(count2));
        bw.flush();

        br.close();
        bw.close();
    }
}
