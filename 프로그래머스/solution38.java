// 배열의 길이를 2의 거듭제곱으로 만들기

class Solution {

    public int[] solution(int[] arr) {

        int len = arr.length;
        int tmp = 1;

        while (tmp <= len) {
            tmp *= 2;
        }

        int[] answer = new int[tmp];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}