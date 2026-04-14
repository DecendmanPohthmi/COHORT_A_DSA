package April_12_26;
import java.util.*;

public class leetcode_937 {
    public String[] reorderLogFiles(String[] logs) {
        List<String[]> num_list = new ArrayList<>();
        List<String[]> log_list = new ArrayList<>();

        for (String log : logs) {
            char[] sub_String = log.toCharArray();

            if (Character.isDigit(sub_String[log.length() - 1])) {
                num_list.add(new String[]{log}); // fix
            } else {
                int idx = log.indexOf(' ');
                String id = log.substring(0, idx);
                String content = log.substring(idx + 1);

                log_list.add(new String[]{content, id, log});
            }
        }

        Collections.sort(log_list, (a, b) -> {
            int cmp = a[0].compareTo(b[0]);
            if (cmp == 0) return a[1].compareTo(b[1]);
            return cmp;
        });

        List<String> combined = new ArrayList<>();

        for (int i = 0; i < log_list.size(); i++) {
            combined.add(log_list.get(i)[2]);
        }

        for (int i = 0; i < num_list.size(); i++) {
            combined.add(num_list.get(i)[0]);
        }

        String[] result = combined.toArray(new String[0]);
        return result;
    }

    public static void main(String[] args) {
        leetcode_937 sol = new leetcode_937();
        String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};

        String[] result = sol.reorderLogFiles(logs);
        for(String data: result) {
            System.out.println(data);
        }
    }
}
