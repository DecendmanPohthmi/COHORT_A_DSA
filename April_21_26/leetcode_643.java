package April_21_26;

public class leetcode_643 {
    public double findMaxAverage(int[] nums, int k) {
        double total_sum = 0;
        for (int i = 0; i < k; i++){
            total_sum += nums[i];
        }

        double window_sum = total_sum;
        for(int i = k; i < nums.length; i++) {
            window_sum = window_sum + nums[i] - nums[i-k];
            total_sum = Math.max(window_sum, total_sum);
        }

        return total_sum/k;
    }

    public static void main(String[] args) {
        leetcode_643 sol = new leetcode_643();
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double avg = sol.findMaxAverage(nums, k);
        System.out.println(avg);
    }
}
