package April_23_26;

import java.util.*;

public class leetcode_624 {

    public int maxDistance(List<List<Integer>> arrays) {
        int minDis = arrays.get(0).get(0);
        int maxDis = arrays.get(0).get(arrays.get(0).size() - 1);

        int res_Max = 0;

        for (int i = 1; i < arrays.size(); i++) {
            int tempMin = arrays.get(i).get(0);
            int tempMax = arrays.get(i).get(arrays.get(i).size() - 1);

            res_Max = Math.max(res_Max, Math.abs(minDis - tempMax));
            res_Max = Math.max(res_Max, Math.abs(maxDis - tempMin));

            minDis = Math.min(minDis, tempMin);
            maxDis = Math.max(maxDis, tempMax);
        }

        return res_Max;
    }

    public static void main(String[] args) {
        leetcode_624 sol = new leetcode_624();
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(1, 2, 3));

        int res = sol.maxDistance(list);
        System.out.println(res);
    }
}
