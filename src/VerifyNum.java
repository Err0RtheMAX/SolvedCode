import java.util.Scanner;
import java.io.IOException;


public class VerifyNum{
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        int[] array = new int[5];
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
            sum += array[i] * array[i];
        }

        System.out.println(sum % 10);


    }
}