package April_12_26;

import java.util.Arrays;

public class leetcode_179 {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
            count += nums[i];
        }

        if(count == 0) return "0";

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        leetcode_179 sol = new leetcode_179();

        String result = sol.largestNumber(new int[]{10,2});
        System.out.println(result);
    }
}
