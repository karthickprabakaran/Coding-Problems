class Solution {
    public int majorityElement(int[] arr) {

        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++)
        {
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i], value+1);
        }

        for(HashMap.Entry<Integer, Integer> it: map.entrySet()){
            if(it.getValue() > n/2)
            {
                return it.getKey();
            }
        }
        return -1;
        
    }
}