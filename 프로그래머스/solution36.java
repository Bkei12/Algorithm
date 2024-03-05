// x 사이의 개수

class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x", -1);
        int[] result = new int[str.length];
        
        for(int i =0; i < str.length; i++) {
            if(str[i].isEmpty()) {
                result[i] = 0;
            } else {
                result[i] = str[i].length();
            }
        }
      
        return result;
    }
}  