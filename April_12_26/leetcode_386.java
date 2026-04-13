package April_12_26;
import java.util.*;

public class leetcode_386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < 10; i++) {
            if(i > n) break;
            dsf(i, n, list);
        }
        return list;
    }

    public void dsf(int num, int target, List<Integer> list) {
        if(num > target) {
            return;
        }

        list.add(num);
        for(int i = 0; i < 10; i++) {
            if((num * 10 + i) > target) break;
            dsf(num * 10 + i, target, list);
        }
    }

    public static void main(String[] args) {
        leetcode_386 sol = new leetcode_386();
        List<Integer> list = sol.lexicalOrder(13);

        System.out.println(list);
    }
}
