package April_25_26;

public class leetcode_918 {
    
    public int kadanes(int[] nums) {
        int subArray = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            subArray = Math.max(subArray, sum);
        }
        return subArray;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int kadane_sum = kadanes(nums);

        int total_sum = 0;
        for(int i = 0; i < nums.length; i++) {
            total_sum += nums[i];
            nums[i] *= -1;
        }

        int reverse_kadane_sum = kadanes(nums);
        if(total_sum + reverse_kadane_sum == 0) return kadane_sum;
        return Math.max(kadane_sum, total_sum + reverse_kadane_sum);
    }

    public static void main(String[] args) {
        leetcode_918 sol = new leetcode_918();
        int[] nums = {1,-2,3,-2};
        int res = sol.maxSubarraySumCircular(nums);
        System.out.println(res);
    }
}
