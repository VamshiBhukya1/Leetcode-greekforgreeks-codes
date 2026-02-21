class Solution {
    public int countPrimeSetBits(int left, int right) {
        int cn=0;
        for(int i=left;i<=right;i++){
            String a=Integer.toBinaryString(i);
            int c=0;
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)=='1'){
                    c++;
                }
            }
                if(Prime(c)==true){
                    cn++;
                }
        }
        return cn;
        
    }
    public boolean Prime(int n){
       
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;

            }
        }
            return true;
    }
}