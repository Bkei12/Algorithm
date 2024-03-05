// 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기

class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(myString);
        StringBuilder sb2 = new StringBuilder(pat);
        sb.reverse();
        sb2.reverse();
        
        for(int i = 0; i <= myString.length() - pat.length(); i++) {
            if(sb.substring(i, i + pat.length()).equals(sb2.toString())) { 
                answer = new StringBuilder(sb.substring(i)).reverse().toString(); 
                break;
            }
        }
        
        return answer;
    }
}


// 다른 풀이 1

class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int patLength = pat.length();
        int myStringLength = myString.length();

        for (int i = myStringLength - 1; i >= 0; i--) {
            String substr = myString.substring(0, i + 1);
            if (substr.endsWith(pat)) {
                answer = substr;
                break;
            }
        }

        return answer;
    }
}

