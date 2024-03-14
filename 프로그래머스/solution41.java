// 특별한 이차원 배열 1
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            answer[i][i] = 1; // 배열의 크기를지정하면 디폴트 값은 0
        }
        return answer;
    }
}
