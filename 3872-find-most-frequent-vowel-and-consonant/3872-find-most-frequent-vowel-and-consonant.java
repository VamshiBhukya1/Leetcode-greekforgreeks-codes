class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer>O=new HashMap<>();
        Map<Character,Integer>C=new HashMap<>();

        int Omax=0;
        int Cmax=0;
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
                O.put(ch,O.getOrDefault(ch,0)+1);
            }else{
                C.put(ch,C.getOrDefault(ch,0)+1);
            }
        }
        for(int i:O.values()){
            if(Omax<i){
                Omax=i;
            }
        }
        for(int i:C.values()){
            if(Cmax<i){
                Cmax=i;
            }
        }
        return Omax+Cmax;


    }
}