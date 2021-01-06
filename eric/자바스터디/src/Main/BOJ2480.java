import java.io.*;
import java.util.StringTokenizer;

public class BOJ2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] dice = new int[3];
        int max = 1;

        for (int i = 0; i < dice.length; i++)
            dice[i] = Integer.parseInt(st.nextToken());

        if(dice[0] == dice[1] && dice[1] == dice[2]) {
            max = 10000 + dice[0] * 1000;
            bw.write(String.valueOf(max));
        }

        else if(dice[0] == dice[1] || dice[0] == dice[2]) {
            max = 1000 + dice[0] * 100;
            bw.write(String.valueOf(max));
        }

        else if(dice[1] == dice[2]) {
            max = 1000 + dice[1] * 100;
            bw.write(String.valueOf(max));
        }

        else {
            for(int i = 0; i < dice.length - 1; i++) {
                for(int j = 1; j < dice.length; j++){
                    if(dice[i] < dice[j])
                        max = dice[j];
                }
            }

            bw.write(String.valueOf(max*100));
        }
        br.close();
        bw.close();
    }
}
