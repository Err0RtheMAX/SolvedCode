import java.util.Scanner;

public class BOJ15552 {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNextInt()){ // true보다 빠르

            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a+b);

        }
        scan.close();
    }
}