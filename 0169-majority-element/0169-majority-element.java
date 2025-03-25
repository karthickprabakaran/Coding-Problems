class Solution {
    public int majorityElement(int[] arr) {

        int cnt = 0;
        int el=0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(cnt == 0)
            {
                cnt =1;
                el = arr[i];
            }
            else if(el == arr[i])
            {
                cnt++;
            }
            else{
                cnt--;
            }
        }

        int cnt1 = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == el)
            {
                cnt1++;
            }
        }
        if(cnt1 > n/2)
        {
            return el;
        }

        return -1;
        
    }
}