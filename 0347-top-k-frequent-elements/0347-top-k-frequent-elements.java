class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length +1];
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int n: nums){
            freq.put(n,freq.getOrDefault(n,0) +1);
        }

        for(int key : freq.keySet()){
            int frequency = freq.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }   
            bucket[frequency].add(key);
        }

        int[] res = new int[k];

        int counter = 0;

        for(int i = bucket.length -1;i>=0  && counter < k;i--){
            if(bucket[i] != null){
                for(Integer integer : bucket[i]){
                    res[counter++] = integer;
                }
            }
        }

        return res;
        
    }
}