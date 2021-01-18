import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ1247 {
    public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        char[] result2 = new char[3];

        for(int k = 0; k < result2.length; k++) {
            int n = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;
            BigInteger[] array = new BigInteger[n];
            char result = '0';

            for (int i = 0; i < n; i++) {
                array[i] = new BigInteger(String.valueOf(Integer.parseInt(st.nextToken())));
                sum = sum.add(array[i]);
            }


                if (sum == BigInteger.ZERO)
                    result = '0';

                else if(sum.compareTo(BigInteger.ZERO) == -1)
                    result = '-';

                else if(sum.compareTo(BigInteger.ZERO) == 1)
                    result = '+';


            result2[k] = result;
            }

        for(int i = 0; i < result2.length; i++)
            System.out.println(result2[i]);

    }
}
