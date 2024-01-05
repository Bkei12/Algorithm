
// 하샤드 수 구하기
class Solution {
    public boolean solution(int x) {
    String s = Integer.toString(x);
    char[] arr = s.toCharArray();
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
        sum += Character.getNumericValue(arr[i]);
    }

    return (x % sum == 0);
 }

}