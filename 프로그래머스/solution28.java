// 문자열 여러번 뒤집기

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        for(int k = 0; k < queries.length; k++) {
            String mid = sb.substring(queries[k][0], queries[k][1]+1);
            sb.replace(queries[k][0], queries[k][1]+1, new StringBuilder(mid).reverse().toString());
        }
        return sb.toString();
    }
}
