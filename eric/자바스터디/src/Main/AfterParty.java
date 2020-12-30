import java.io.*;
// import java.util.StringTokenizer;

public class AfterParty {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        int people = Integer.parseInt(br.readLine());
        int room = Integer.parseInt(br.readLine());
        int[] newspaper = new int[5];

        for(int i = 0; i < newspaper.length; i++){
            newspaper[i] = Integer.parseInt(br.readLine());
            newspaper[i] -= (people * room);
            bw.write(String.valueOf(newspaper[i]));
            bw.newLine();
        }
        br.close();
        bw.close();

    }
}
