import java.io.IOException;
import java.util.Scanner;



public class BOJ11943 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[4];
        int count = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        while((array[1] != 0 && array[3] != 0) || (array[0] != 0 && array[2] != 0)) {
            if (array[0] < array[2]) {
                count += array[0];
                array[0] = 0;
                array[2] += array[0];
            } else if (array[0] > array[2]) {
                count += array[2];
                array[0] += array[2];
                array[2] = 0;
            }

            if ((array[0] == 0 && array[3] == 0) || (array[1] == 0 && array[2] == 0))
                break;

            if (array[1] < array[3]) {
                count += array[1];
                array[1] += array[3];
                array[3] = 0;
            } else if (array[1] > array[3]) {
                count += array[3];
                array[1] = 0;
                array[3] += array[1];
            }
        }

            System.out.println(count);
    }
}
