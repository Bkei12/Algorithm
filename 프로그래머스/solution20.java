import java.util.*;

class Solution20 {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // 각 길이별 문자열 개수 세기
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            int len = str.length();
            map.put(len, map.getOrDefault(len, 0) + 1);
        }

        int maxCount = 0;
        // 가장 많은 문자열 개수 찾기
        for (Integer count : map.values()) {
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
