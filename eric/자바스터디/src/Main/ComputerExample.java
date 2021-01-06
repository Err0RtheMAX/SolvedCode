import java.io.IOException;

class computer {
    int sum1(int[] values){
        int sum = 0;
        for(int i = 0 ; i < values.length; i++)
            sum += values[i];

        return sum;
    }


    int sum2(int ... values){
        int sum = 0;
        for(int i = 0; i < values.length; i++)
            sum += values[i];

        return sum;
    }
}

public class ComputerExample{
    public static void main(String[] args) throws IOException{
        computer mycom = new computer();

        int[] values1 = {1, 2, 3};
        int result1 = mycom.sum1(values1);
        System.out.println(result1);

        int result2 = mycom.sum1(new int[] {1, 2, 3, 4, 5, 6, 7});
        System.out.println(result2);

        int result3 = mycom.sum2(1, 2, 3);
        System.out.println(result3);

    }
}
