// 정사각형으로 만들기

public class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[][] result;
        
        if (row > col) {
            result = new int[row][row];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    result[i][j] = arr[i][j]; 
                }
            }
        } else {
            result = new int[col][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    result[i][j] = arr[i][j]; 
                }
            }
        } 
        
        return result;
    }
}
