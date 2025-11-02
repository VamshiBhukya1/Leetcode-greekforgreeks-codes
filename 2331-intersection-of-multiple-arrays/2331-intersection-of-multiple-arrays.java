class Solution {
    public List<Integer> intersection(int[][] nums) {
        int n=nums.length;
        List<Integer>res=new ArrayList<>();
        Map<Integer,Integer>mp=new HashMap<>();
        for(int[] arr:nums){
         Set<Integer> seen = new HashSet<>(); // to avoid counting duplicates within same array
            for (int num : arr) {
                if (!seen.contains(num)) {
                    mp.put(num, mp.getOrDefault(num, 0) + 1);
                    seen.add(num);
                }
            }
        }
         for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == n) {
                res.add(entry.getKey());
            }
        }

        Collections.sort(res); // sort if needed (optional)
        return res;
    }
}