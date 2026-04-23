package April_23_26;
import java.util.*;

class leetcode_442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] freq = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;

            if(freq[nums[i]] > 1) {
                list.add(nums[i]);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        leetcode_442 sol = new leetcode_442();

        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = sol.findDuplicates(arr);

        System.out.println(result);
    }
}