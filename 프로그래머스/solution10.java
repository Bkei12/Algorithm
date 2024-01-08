class Solution10 {
    public int[] solution(int[] arr) {
        int length = 0;
        
        // 배열의 길이 계산
        for (int i = 0; i < arr.length; i++) {
            length += arr[i];
        }
        
        // 결과 배열 초기화
        int[] result = new int[length];
        int index = 0;

        // 배열 복사
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                result[index++] = arr[i];
            }
        }
        
        return result;
    }
}
