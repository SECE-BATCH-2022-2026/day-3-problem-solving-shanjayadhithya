package BCT.day6;

import java.util.*;
import java.util.regex.*;

public class pat{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = "^(2[1-9]|3[0-9]|4[0-9])$";
        System.out.print(s.matches(p));
    }
}