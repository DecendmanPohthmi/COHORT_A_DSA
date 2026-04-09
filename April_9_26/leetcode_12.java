package April_9_26;

import java.util.Scanner;

public class leetcode_12 {
    public static String intToRoman(int n) {
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", 
        "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numbers.length; i++) {
            while(n >= numbers[i]) {
                n -= numbers[i];
                sb.append(romans[i]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = intToRoman(n);
        System.out.println(result);

        sc.close();
    }
}
