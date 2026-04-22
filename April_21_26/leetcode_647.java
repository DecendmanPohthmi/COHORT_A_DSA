package April_21_26;

class leetcode_647 {
    public boolean checkvalid(String str) {
        for(int i=0, j=str.length()-1; i<j; i++,j--) {
            if(str.charAt(i) != str.charAt(j)) return false;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                String temp = s.substring(i, j + 1);
                if(checkvalid(temp)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_647 sol = new leetcode_647();
        int result = sol.countSubstrings("abc");
        System.out.println(result);
    }
}
