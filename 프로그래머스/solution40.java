// l로 만들기

class Solution {
    public String solution(String myString) {
        char[] arr = myString.toCharArray();
        
        for(int i =0; i < arr.length; i++) {
            if(arr[i] < 'l') {
                arr[i] = 'l'; // 부등호 비교는 문자와 숫자만 가능
            }
        }
        
        return new String(arr);
    }
}