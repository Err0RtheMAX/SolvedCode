import java.io.*;
import java.util.Arrays;
import java.lang.Math;

class Caculate{
    int sum = 0;
    int count = 0;
    int j = 0;

    public int[] change(int[] array){
        for(int i = 0; i < array.length; i++) {
            array[i] *= (int)Math.pow(2, array.length - 1 - count);
            sum += array[i];
            count += 1;
        }

       // sum *= 17;

            /*while (sum > 0) {
                array[j] = sum % 2;
                sum /= 2;
                j++;
            }*/

        System.out.println(sum);
        return array;
    }
}

public class BOJ5893 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Caculate calcuate = new Caculate();

        String array0 = br.readLine();
        String[] array = array0.split("");
        int[] array2 = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();

        calcuate.change(array2);


        br.close();

    }
}
