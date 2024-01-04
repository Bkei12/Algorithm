//대문자를 소문자로, 소문자를 대문자로

class Solution8 {
    public String solution(String my_string) {
        String answer="";
        for(int i=0; i<my_string.length(); i++) {
                if(Character.isUpperCase(my_string.charAt(i))) {                //i번째 문자가 대문자면 
                    answer+=String.valueOf(my_string.charAt(i)).toLowerCase();  //charAt(i)를 사용해서 문자로 바꾸었기 때문에 
                                                                                //String.valueOf()를 사용해서 다시 문자열로 변경
                }else {                                                         //i번째 문자가 소문자면
                    answer+=String.valueOf(my_string.charAt(i)).toUpperCase();  //대문자로 바꿔서 더함
                }
            }
        return answer;
    }
}