// 진료 순서 정하기
import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
    	// 입력 배열을 복제하여 정렬할 배열을 생성
        int[] asc = emergency.clone();
        // 결과를 저장할 배열 생성
        int[] answer = new int[emergency.length];
        
        // 복제한 배열을 오름차순으로 정렬
        Arrays.sort(asc);
        
        // asc 배열의 원소를 하나씩 탐색 
        for(int i=0; i<asc.length; i++) {
        	// emergency 배열의 원소를 하나씩 탐색
            for(int j=0; j<emergency.length; j++) {
            	// asc의 원소와 emergency의 원소가 일치하면
                if(asc[i]==emergency[j]) {
                	// 결과를 저장하는 배열 answer에 저장
                    answer[j]=emergency.length-i;
                }
            }
        }
        return answer;
    }
}