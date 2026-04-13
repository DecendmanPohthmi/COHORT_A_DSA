package April_12_26;

import java.util.*;

public class leetcode_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList(map.values());
    }
    public static void main(String[] args) {
        leetcode_49 sol = new leetcode_49();
        List<List<String>> result = sol.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

        System.out.println(result);
    }
}
