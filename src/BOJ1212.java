import java.io.*;

public class BOJ1212 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int len = s.length();
        if(s.equals("0") && len == 1){
            bw.write("0");
        } else {
            for(int i = 0; i < len; i++){
                if(i == 0) bw.write(last(s.charAt(i)));
                else bw.write(trans(s.charAt(i)));
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
    static String trans(char a) {
        String result = "";
        if (a == '0') result = "000";
        else if (a == '1') result = "001";
        else if (a == '2') result = "010";
        else if (a == '3') result = "011";
        else if (a == '4') result = "100";
        else if (a == '5') result = "101";
        else if (a == '6') result = "110";
        else if (a == '7') result = "111";
        return result;
    }

    static String last(char a) {
        String result = "";
        if (a == '1') result = "1";
        else if (a == '2') result = "10";
        else if (a == '3') result = "11";
        else if (a == '4') result = "100";
        else if (a == '5') result = "101";
        else if (a == '6') result = "110";
        else if (a == '7') result = "111";
        return result;
    }
}