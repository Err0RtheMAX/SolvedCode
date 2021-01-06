/*import java.util.Scanner;

public class SuperRich2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        int people = scan.nextInt();

        System.out.println(money / people);
        System.out.println(money % people);

    }
}*/ // runtime error 1

/*import java.io.*;

public class SuperRich2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.in));

        int money = Integer.parseInt(br.readLine());
        int people = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(money / people);
        System.out.println(money % people);

        bw.close();

    }
}*/  // runtime error 2

import java.math.BigInteger;
import java.util.Scanner;
import java.io.IOException;

public class SuperRich2{
    public static void main(String[] args) throws IOException{

        Scanner scan = new Scanner(System.in);
        BigInteger money = scan.nextBigInteger();
        BigInteger people = scan.nextBigInteger();

        System.out.println(money.divide(people));
        System.out.println(money.mod(people));

    }
}