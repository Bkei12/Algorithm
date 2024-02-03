class Solution {
    public int solution(int[] array, int height) {
        int[] answer = new int[array.length];
        
        int result = 0;
        for(int i =0; i < array.length; i++){
            answer[i] = array[i];
            if (answer[i] > height){
                result +=1;            
            }
        }
        return result;
    }
}