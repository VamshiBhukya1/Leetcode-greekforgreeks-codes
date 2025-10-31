class Solution {
    public int[] getSneakyNumbers(int[] nums) {
            Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        int j=0;
        ArrayList<Integer>rest=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            if(entry.getValue()>1){
                rest.add(entry.getKey());
            }
        }
        int[] res=new int[rest.size()];
        for(int i=0;i<rest.size();i++){
            res[i]=rest.get(i);
        }
        return res;

        
    }
}