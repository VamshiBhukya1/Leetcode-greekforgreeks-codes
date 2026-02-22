class Solution {
    public int[][] insert(int[][] arr, int[] newInterval) {
        int n=arr.length;
        ArrayList<int[]>res=new ArrayList<>();
        int i=0;
        while(i<n&& arr[i][1]<newInterval[0]){
            res.add(arr[i]);
            i+=1;
        }
        while(i<n&& arr[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],arr[i][0]);
            newInterval[1]=Math.max(newInterval[1],arr[i][1]);
            i=i+1;
        }
        res.add(newInterval);
        while(i<n){
            res.add(arr[i]);
            i=i+1;
        }
        return res.toArray(new int[res.size()][]);
    }
}