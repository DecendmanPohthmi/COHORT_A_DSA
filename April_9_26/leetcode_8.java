package April_9_26;

import java.util.Scanner;

public class leetcode_8 {
    public static int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;

        int sign = 1;
        int i = 0;

        long result = 0;

        if(s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1:1;
            i++;
        }

        while( i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            if(result > Integer.MAX_VALUE) break;
            i++;
        }

        if((result*sign) < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if((result*sign) > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int) result*sign;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int result = myAtoi(s);
        System.out.println(result);

        scanner.close();
    }
}
