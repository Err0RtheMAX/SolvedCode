import java.io.*;
import java.util.StringTokenizer;

public class BOJ5575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] time = new int[18];

        for (int i = 0; i < time.length; i++)
            time[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 3; i++) {
            time[6 * i] = time[6 * i + 3] - time[6 * i]; // hour
            time[6 * i + 1] = time[6 * i + 4] - time[6 * i + 1]; // min
            time[6 * i + 2] = time[6 * i + 5] - time[6 * i + 2]; // sec



            if (time[6 * i + 2] < 0) {

                if(time[6 * i + 1] < 0 && time[6 * i + 2] < 0){
                    time[6 * i + 3] -= 1;
                    time[6 * i + 1] += 60;
                }
                else {
                    time[6 * i] -= 1;
                    time[6 * i + 2] += 60;
                }
            }

            if (time[6 * i + 1] < 0) {
                time[6 * i + 3] -= 1;
                time[6 * i + 4] += 60;
            }
        }

        for (int j = 0; j < 3; j++) {
            System.out.println(time[6 * j] + " " + time[6 * j + 1] + " " + time[6 * j + 2]);
        }

        br.close();
        bw.close();
    }

}