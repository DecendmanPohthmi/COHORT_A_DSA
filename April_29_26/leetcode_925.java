package April_29_26;

public class leetcode_925 {
    public boolean isLongPressedName(String name, String typed) {
        char[] na = name.toCharArray();
        char[] ty = typed.toCharArray();

        int i = 0, j = 0;

        while (j < ty.length) {

            if (i < na.length && na[i] == ty[j]) {
                i++;
                j++;
            }
            else if (j > 0 && ty[j] == ty[j - 1]) {
                j++;
            }
            else {
                return false;
            }
        }

        return i == na.length;
    }

    public static void main(String[] args) {
        leetcode_925 sol = new leetcode_925();
        String name = "alex";
        String typed = "aaleex";

        boolean res = sol.isLongPressedName(name, typed);
        System.out.println(res);
    }
}
