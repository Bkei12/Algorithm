// 배열 만들기 2

import java.util.*;

class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        
        for(int i = l; i <= r; i++) {
            String numStr = String.valueOf(i);

            if(numStr.matches("[05]+")) {
                result.add(i);
            }
        }

        if(result.isEmpty()) {
            result.add(-1);
        }
        
        return result;
    }
}
