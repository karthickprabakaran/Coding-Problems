class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0) return new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            String frequencyString = getFrequency(str);

            if(map.containsKey(frequencyString)){
                map.get(frequencyString).add(str);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(frequencyString, strList);
            }
        }

        return new ArrayList<>(map.values());
    }

    private static String getFrequency(String str){
        int[] freq = new int[26];

        for(char c : str.toCharArray()){
            freq[c - 'a']++;
        }

        StringBuilder frequencyString = new StringBuilder("");
        char c = 'a';

        for(int i : freq){
            frequencyString.append(c);
            frequencyString.append(i);
            c++;
        }

        return frequencyString.toString();
    }
}