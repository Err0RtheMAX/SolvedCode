import java.io.IOException;
import java.util.Scanner;

public class BOJ1547 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int[] swap = new int[3];
        swap[0] = 1;
        int temp = 0;
        int found = -1;

        for(int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            temp = swap[a-1];
            swap[a-1] = swap[b-1];
            swap[b-1] = temp;
        }

        for(int i = 0; i < swap.length; i++){
            if(swap[i] == 1)
                found = i + 1;
        }

        System.out.println(found);
    }
}
