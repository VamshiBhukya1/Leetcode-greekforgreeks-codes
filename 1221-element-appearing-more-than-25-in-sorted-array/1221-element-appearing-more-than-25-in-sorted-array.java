class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int n=arr.length;
        for(int i:arr){
        mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int res=-1;
        int p=n/4;
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            if(entry.getValue()>p){
              res=entry.getKey();
              break;
            }
        }
        return res;
    }
}