package April_24_26;
import java.util.*;

public class leetcode_881 {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        
        while(left <= right){
            if(people[left] + people[right] <= limit){
                count++;
                left++;
                right--;
            }
            else{
                count++;
                right--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] people = {1,2};
        int limit = 3;

        leetcode_881 sol = new leetcode_881();
        int result = sol.numRescueBoats(people, limit);
        System.out.println(result);
    }
}
