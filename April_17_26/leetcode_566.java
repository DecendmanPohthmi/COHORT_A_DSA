package April_17_26;
import java.util.*;

class leetcode_566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] new_matrix = new int[r][c];

        if(mat.length * mat[0].length != r * c) return mat;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < mat.length; i++) {
            for(int num : mat[i]) {
                list.add(num);
            }
        }

        int idx = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                new_matrix[i][j] = list.get(idx);
                idx++;
            }
        }

        return new_matrix;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        int r = 1;
        int c = 4;

        leetcode_566 sol = new leetcode_566();

        int[][] result = sol.matrixReshape(arr, r, c);
        
        for(int i = 0; i < result.length; i++) {
            for(int num : result[i]) {
                System.out.println(num);
            }
        }
    }
}
