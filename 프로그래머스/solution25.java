// 수열과 구간 쿼리2

import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[][] queries) {
        List<Integer> result = new ArrayList<>();

        for (int k = 0; k < queries.length; k++) {
            List<Integer> min = new ArrayList<>(); // 초기화
            for (int i = queries[k][0]; i <= queries[k][1]; i++) {
                if (arr[i] > queries[k][2]) {
                    min.add(arr[i]);
                }
            }
            if (min.isEmpty()) {
                result.add(-1);
            } else {
                result.add(Collections.min(min)); // 세미콜론 추가
            }
        }

        return result; // 결과 반환
    }
}
