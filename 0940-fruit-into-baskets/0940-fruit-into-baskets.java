class Solution {
    public int totalFruit(int[] fruits) {

        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;

        for(int right = 0; right < fruits.length;right++){
            int fruitCount = map.getOrDefault(fruits[right], 0);
            map.put(fruits[right], fruitCount +1);

            while(map.size() > 2){
                int fruitN = map.get(fruits[left]);
                if(fruitN  == 1){
                    map.remove(fruits[left]);
                }else{
                    map.put(fruits[left], fruitN - 1);
                }
                left++;
            }

            max = Math.max(max, right - left +1);
        }
        return max;
    }
}