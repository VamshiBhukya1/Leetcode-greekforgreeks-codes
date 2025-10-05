class Solution {
    public int secondHighest(String s) {
      int first=-1;
      int second=-1;
      for(char ch:s.toCharArray()){
        if(Character.isDigit(ch)){
        int num=Integer.parseInt(String.valueOf(ch));
            
            if(first<num){
                second=first;
                first=num;
            }
            else if(num!=first &&num>second){
                second=num;
            }
        }
      }
      return second;
    }
}