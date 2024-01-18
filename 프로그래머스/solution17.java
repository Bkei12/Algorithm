import java.util.*;

class Solution17 {
    public List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                list.add(i);
            }
        }

        if (list.size() > 0) {
            for (int i = list.get(0); i <= list.get(list.size() - 1); i++) {
                result.add(arr[i]);
            }
        } else {
            result.add(-1);
        }

        return result;
    }
}
