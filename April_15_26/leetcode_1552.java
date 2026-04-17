package April_15_26;
import java.util.*;

public class leetcode_1552 {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int min_length = 1;
        int max_length = position[position.length - 1] - position[0];

        return solve(position, m, min_length, max_length);
    }

    public int solve(int[] arr, int m, int low, int high) {
        if(low > high) return high;

        int mid = (low + high) / 2;
        if(get_length(arr, m, mid)) {
            return solve(arr, m, mid + 1, high);
        }
        else {
            return solve(arr, m, low, mid - 1);
        }
    }


    public boolean get_length(int[] position, int m, int distance) {
        int last = position[0];
        int count = 1;
        for(int i = 1; i < position.length; i++) {
            if(position[i] - last >= distance) {
                count++;
                last = position[i];
            }
            if(count == m) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        leetcode_1552 sol = new leetcode_1552();
        int[] nums = {1,2,3,4,7};
        int k = 3;

        int result = sol.maxDistance(nums, k);
        System.out.println(result);
    }
}