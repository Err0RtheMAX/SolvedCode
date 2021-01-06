import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class BOJ5543 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        int[] array = new int[3];
        int[] array2 = new int[2];
        int[] array3 = new int[3];


        for(int i = 0; i < array.length; i++)
            array[i] = scan.nextInt(); // 0상덕버거 1중덕버거 2하덕버거

        for(int i = 0; i < array2.length; i++)
            array2[i] = scan.nextInt(); //0콜라 1사이다


        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array2.length; j++){
                array3[i] = (array[i] + array2[j]) - 50;
            }
        }

        int min = array3[0];

        for(int i = 0; i < array3.length; i++){
            if(min > array3[i])
                min = array3[i];
        }


        System.out.println(array3[0]);


    }
}
