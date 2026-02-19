class Solution {
    public int countBinarySubstrings(String s) {
     int n=s.length();
     int c=0;
     for(int i=0;i<n-1;i++){
        if(s.charAt(i)!=s.charAt(i+1)){
            int left=i;
            int right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(i)&& s.charAt(right)==s.charAt(i+1)){
                c++;
                left--;
                right++;
            }
        }
     }
     return c;
        
    }
}