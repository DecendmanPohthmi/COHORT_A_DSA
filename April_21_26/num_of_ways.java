package April_21_26;

import java.util.Scanner;

public class num_of_ways {

    public static int solved(int[] arr) {
        int n = arr.length;

        long total_sum = 0;
        for (int x : arr)
            total_sum += x;

        if (total_sum % 3 != 0)
            return 0;

        if(total_sum % 3 != 0) return 0;
        long target = total_sum / 3;
        long second_target = 2 * target;

        long sum = 0;
        int count = 0;
        int ways = 0;

        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];

            if (sum == second_target) {
                ways += count;
            }

            if (sum == target) {
                count++;
            }
        }

        return ways;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = solved(arr);

        System.out.println(res);
        sc.close();
    }
}