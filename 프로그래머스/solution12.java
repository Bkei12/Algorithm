class Solution12 {
	public int solution(String myString, String pat) {
    	int answer = 0;
        
        String rpStr = myString.replace('A', 'ㅗ').replace('B', 'A').replace('ㅗ', 'B');
        
        if(rpStr.contains(pat)) {
        	answer = 1;
        }
        return answer;
    }
}