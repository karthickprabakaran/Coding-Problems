class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int count1 = 0;
        int count2 = 0;
        int num1 = -1;
        int num2 = -1;

        List<Integer> list = new ArrayList<>();

        for(int num : nums){
            if(num == num1) count1++;
            else if (num == num2) count2++;
            else if(count1 == 0) {
                num1 = num;
                count1 = 1;
            }
            else if(count2 == 0){
                num2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }  
        }
        int cnt1 = 0;
        int cnt2 = 0;
        for(int num : nums){
            
            if(num == num1) cnt1++;
            if(num == num2) cnt2++;
        } 

        if(!list.contains(num1)){
                if(cnt1 > nums.length /3) list.add(num1);
            }
            if(!list.contains(num2)){
                if(cnt2 > nums.length /3) list.add(num2);
            }

        return list;

        
        
    }
}