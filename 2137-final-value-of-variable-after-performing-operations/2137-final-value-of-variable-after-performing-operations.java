class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int p=0;
        for(String i:operations){
            for(int j=0;j<=i.length();j++){
                if(i.charAt(j)=='+'){
                    p++;
                    break;
                }else if(i.charAt(j)=='-'){
                    p--;
                    break;
                }
            }
        }
        return p;
        
    }
}