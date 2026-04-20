package April_20_26;

class leetcode_330 {
    public int minPatches(int[] nums, int n) {
        int i = 0;
        long starting = 1;
        int patch = 0;

        while(starting <= n) {
            if(i < nums.length && nums[i] <= starting) {
                starting += nums[i];
                i++;
            } else {
                starting += starting;
                patch++;
            }
        }
        return patch;
    }
    
    public static void main(String[] args) {
        leetcode_330 sol = new leetcode_330();
        int[] arr = {1,3};
        int result = sol.minPatches(arr, 6);
        System.out.println(result);
    }
}