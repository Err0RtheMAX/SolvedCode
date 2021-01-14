import java.io.IOException;
import java.util.Scanner;

class CheckHeight{
    public void height(int[] array) {

        String result = "No Fish";

        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] < array[i+1] && i != array.length - 2)
                continue;

            else if(array[i] < array[i+1] && i == array.length - 2)
                result = "Fish Rising";

            else
                break;
        }

        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i+1] && i != array.length - 2)
                continue;

            else if(array[i] > array[i+1] && i == array.length - 2)
                result = "Fish Diving";

            else
                break;
        }

        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] == array[i+1] && i != array.length - 2)
                continue;

            else if(array[i] == array[i+1] && i == array.length - 2)
                result = "Fish At Constant Depth";

            else
                break;
        }

        System.out.println(result);
    }
}


public class BOJ6764 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int[] fish = new int[4];

        for(int i = 0; i < fish.length; i++)
            fish[i] = scan.nextInt();

        CheckHeight checkHeight = new CheckHeight();
        checkHeight.height(fish);


    }
}
