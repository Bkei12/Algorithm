class Solution18 {
    public int solution(String[] order) {
        int result = 0;
        
        for(int i =0; i < order.length; i++) {
            if(order[i].contains("americano") || order[i].contains("anything")) {
                result += 4500;
            } else {
                result += 5000;
            }
        }
        
        return result;
    }
}