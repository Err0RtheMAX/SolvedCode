import java.io.*;
import java.util.StringTokenizer;

class Time {
    int[] time = new int[6];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    {
        try {
            st = new StringTokenizer(br.readLine(), " ");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inputTime() throws IOException {
        for (int i = 0; i < time.length; i++) {
            time[i] = Integer.parseInt(st.nextToken());
            this.time[i] = time[i];
        }
    }


    public void printTime() throws IOException {
        for (int i = 0; i < time.length; i++) {
            for (int j = 0; j < time.length; j++) {
            bw.write(String.valueOf(time[j]));
            bw.write(" ");
        }
            bw.newLine();
    }
        br.close();
        bw.close();
    }
}



public class BOJ5575 {
    public static void main(String[] args) throws IOException {
        Time time1 = new Time();
        Time time2 = new Time();
        Time time3 = new Time();

        time1.inputTime();
        time2.inputTime();
        time3.inputTime();

        time1.printTime();
        time2.printTime();
        time3.printTime();


    }
}
