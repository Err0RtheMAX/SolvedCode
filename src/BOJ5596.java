import java.util.Scanner;

public class BOJ5596 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[4];
        int[] b = new int[4];
        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
            totalA += a[i];
        }


        for (int i = 0; i < b.length; i++) {
            b[i] = scan.nextInt();
            totalB += b[i];
        }

        if(totalA > totalB)
            System.out.println(totalA);

        else
            System.out.println(totalB);
    }
}
