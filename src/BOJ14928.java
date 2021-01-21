import java.io.*;


public class BOJ14928 {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();
        long k = 0;

        for(int i = 0; i < n.length(); i++)
            k = (k * 10 + (n.charAt(i) - '0')) % 20000303;

        // BigInteger n = new BigInteger(br.readLine());
        // bw.write(String.valueOf(n.mod(BigInteger.valueOf(20000303))));
        bw.write(String.valueOf(k));
        bw.flush();
        br.close();
        bw.close();
    }
}
