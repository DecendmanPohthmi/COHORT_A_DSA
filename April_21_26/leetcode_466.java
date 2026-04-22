package April_21_26;

public class leetcode_466 {

    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        int i = 0, j = 0, count = 0;
        while(n1 > 0) {
            if(arr1[i] == arr2[j]) {
                if(++j == arr2.length) {
                    j = 0;
                    count++;
                }
            }
            if(++i == arr1.length) { 
                i = 0; n1--;
            }
        }

        return count / n2;
    }

    public static void main(String[] args) {
        leetcode_466 sol = new leetcode_466();
        int res = sol.getMaxRepetitions("abc", 3,"ac", 1);
        System.out.println(res);
    }
}
