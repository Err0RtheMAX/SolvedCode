import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class BOJ5532 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        double[] array = new double[5]; // 0방학, 1총국어, 2총수학, 3하루국어, 4하루수학

        for(int i = 0; i < array.length; i++)
            array[i] = scan.nextDouble();

        if((array[1] / array[3]) >= (array[2] / array[4]))
            array[0] -= (int) Math.ceil(array[1] / array[3]);


        else
            array[0] -= (int) Math.ceil(array[2] / array[4]);

        System.out.printf("%.0f", array[0]);
    }
}
