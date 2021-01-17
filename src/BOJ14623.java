import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class ChangeNum {

    int result = 0;

    public int change(List number1, List number2) {


        return result;
    }
}

public class BOJ14623 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int B1 = scan.nextInt();
        int B2 = scan.nextInt();
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        for(int i = 0; i < array1.size(); i++)
            array1.add(i, B1);

        ChangeNum changeNum = new ChangeNum();

        System.out.println(changeNum.change(array1, array2));

    }
}
