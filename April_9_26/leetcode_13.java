package April_9_26;

import java.util.Scanner;

public class leetcode_13 {
    private static int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    public static int romanToInt(String s) {

        int total = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = value(s.charAt(i));

            if (current < prev) {
                total -= current;
            } else {
                total += current;
            }

            prev = current;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine().toUpperCase();
        int result = romanToInt(roman);
        System.out.println(result);

        sc.close();
    }
}
