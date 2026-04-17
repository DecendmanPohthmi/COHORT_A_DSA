package April_16_26;

class leetcode_410 {
    public boolean get_page(int[] nums, int k, int sub_A) {
        int A = 1;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            count += nums[i];
            if(count <= sub_A) {
                continue;
            }
            else {
                count = nums[i];
                A++;
                if(A > k) return false;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        for(int num : nums) {
            high += num;
            low = Math.max(low, num);
        }

        int ans = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(get_page(nums, k, mid)) {
                ans = mid;
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        leetcode_410 sol = new leetcode_410();
        int[] nums = {7,2,5,10,8};
        int k = 2;

        int result = sol.splitArray(nums, k);
        System.out.println(result);
    }
}
