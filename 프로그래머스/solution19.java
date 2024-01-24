import java.util.ArrayList;
import java.util.List;

class Solution19 {
    public List<String> solution(String my_str, int n) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < my_str.length(); i += n) {
            // 문자열을 길이 n씩 자르고 리스트에 추가
            result.add(my_str.substring(i, Math.min(i + n, my_str.length())));
        }

        return result;
    }
}
