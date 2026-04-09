package April_9_26;

import java.util.Scanner;

public class leetcode_65 {
    public static boolean isNumber(String s) {
        s = s.trim();

        boolean num_contain = false;
        boolean numAfterE = false;
        boolean dot_contain = false;
        boolean e_contain = false;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                num_contain = true;
                numAfterE = true;
            }
            else if(ch == '.') {
                if(dot_contain || e_contain) return false;
                dot_contain = true;
            }
            else if(ch == 'e' || ch == 'E') {
                if(e_contain || !num_contain) return false;
                e_contain = true;
                numAfterE = false;
            }
            else if(ch == '-' || ch == '+') {
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }
            else {
                return false;
            }
        }

        return num_contain && numAfterE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean result = isNumber(s);
        System.out.println(result);
        
        sc.close();
    }
}
