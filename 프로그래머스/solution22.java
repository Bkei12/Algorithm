import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr); // 오름차순 정렬

        StringBuilder sb = new StringBuilder();
        for(int i = arr.length -1; i >= 0; i--) {
            sb.append(arr[i]); // 문자 하나씩 합치기
        }
        
        return Long.parseLong(sb.toString());
    }
}