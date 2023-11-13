class Solution2 {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        
        
        char[] charArray = s.toCharArray();
        
        for(int i =0; i< charArray.length; i++){
            if(charArray[i] == 'p' || charArray[i] == 'P'){
                p +=1;
            } else if(charArray[i] == 'y' || charArray[i] == 'Y'){
                y +=1;
            }
        }
        
        if(p == y){
            return true;
        } else{
            return false;
        }
        
    }
}