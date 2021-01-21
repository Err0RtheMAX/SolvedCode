import java.io.IOException;
import java.util.Scanner;

public class BOJ1267 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int ycost = 0;
        int mcost = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            int a = 0;
            int b = 0;

            if (arr[i] < 30 && arr[i] > 0)
                ycost += 10;

            if (arr[i] < 60 && arr[i] > 0)
                mcost += 15;

            else {
                if(arr[i] == 30)
                    a = 1;
                if(arr[i] == 60)
                    b = 1;

                ycost += (10 * ((arr[i] / 30) + (arr[i] % 30) + a));
                mcost += (15 * ((arr[i] / 60) + (arr[i] % 60) + b));
            }
        }
            if(ycost > mcost)
                System.out.println("M " + mcost);

            else if(ycost < mcost)
                System.out.println("Y " + ycost);

            else
                System.out.println("Y M " + mcost);

    }
}
