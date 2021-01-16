import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class BOJ13136 {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        BigInteger r = new BigInteger(String.valueOf(Integer.parseInt(st.nextToken())));
        BigInteger c = new BigInteger(String.valueOf(Integer.parseInt(st.nextToken())));
        BigInteger cctv = new BigInteger(String.valueOf(Integer.parseInt(st.nextToken())));
        BigInteger garo = r.divide(cctv);
        BigInteger sero = c.divide(cctv);

        if(r.mod(cctv) != BigInteger.ZERO)
            garo = garo.add(BigInteger.ONE);

        if(c.mod(cctv) != BigInteger.ZERO)
            sero = sero.add(BigInteger.ONE);

        bw.write(String.valueOf(garo.multiply(sero)));

        br.close();
        bw.close();
    }
}
