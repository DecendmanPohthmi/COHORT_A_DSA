package April_12_26;

public class leetcode_58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String last_word = s.substring(s.lastIndexOf(' ') + 1);
        return last_word.length();
    }

    public static void main(String[] args) {
        leetcode_58 sol = new leetcode_58();

        int length = sol.lengthOfLastWord("Hi my name id Decendman");
        System.out.println(length);
    }
}

