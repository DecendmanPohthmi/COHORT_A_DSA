package April_29_26;
import java.util.*;

public class leetcode_1023 {
    public boolean str_match(String s1, String s2) {
        int i = 0, j = 0;
        while(i < s1.length())
        {

            if(j < s2.length() && s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
            else if (Character.isUpperCase(s1.charAt(i))) {
                return false;
            }
            i++;
        }

        if(j == s2.length()) return true;
        return false;
    }

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<>();
        for(int i = 0; i < queries.length; i++) {
            boolean ans = str_match(queries[i], pattern);
            list.add(ans);
        }

        return list;
    }

    public static void main(String[] args) {
        leetcode_1023 sol = new leetcode_1023();

        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FB";
        List<Boolean> res = sol.camelMatch(queries, pattern);
        
        for(boolean ans: res) {
            System.out.println(ans);
        }
    }
}