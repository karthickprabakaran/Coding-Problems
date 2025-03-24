class Solution {
    public int[] twoSum(int[] arr, int target) {

        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int i =0;i<n;i++)
        {
            int req = target - arr[i];
            if(hm.containsKey(req))
            {
                return new int[] {hm.get(req), i};
            }
            hm.put(arr[i],i);
        }
        return new int[] {};    
    }
}