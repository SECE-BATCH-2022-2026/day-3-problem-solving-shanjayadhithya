import java.io.*;
public class pro1 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();
        int n = Integer.parseInt(br.readLine());
        System.out.println(UserMainCode.repeatFront(inp, n));
    }
    }
class UserMainCode{

public static String repeatFront(String s, int n) {
        if (s.length() == 0) return "";

        if (s.length() < n) {
            String res = "";
            for (int i = 0; i < n; i++) res += s;
            return res;
        }

        String part = s.substring(0, n);
        String res = "";
        for (int i = 0; i < n; i++) res += part;

        return res;
    }
}
