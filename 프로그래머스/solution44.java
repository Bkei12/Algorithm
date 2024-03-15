// 최댓값 만들기 (2)

import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int first = 1;
        int left = 1;
        Arrays.sort(numbers);
        
        for(int i=0; i < 2; i++){
            first *= numbers[i]; 
        }
        
        for(int i= 1; i <= 2; i++) {
            left *= numbers[numbers.length - i];
        }
        
        if(left > first) {
            return left;
        } else {
            return first;
        }
    }
}