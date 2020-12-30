import java.io.*;

public class AplusB2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        br.close();
        bw.write(String.valueOf(a + b)); // write를 사용 할 때 반드시 String형으로 변환시키고 valueOf 메소드를 사용한다.
        bw.close();

    }
}