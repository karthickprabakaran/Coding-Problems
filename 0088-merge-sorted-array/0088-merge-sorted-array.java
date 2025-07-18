class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m-1;
        int right = n-1;

        int ptr = m + n -1;

        while( left >=0 && right >= 0){
            if(nums1[left] > nums2[right]){
                nums1[ptr] = nums1[left];
                ptr--;
                left--;
            }else{
                nums1[ptr] = nums2[right];
                ptr--;
                right--;
            }
        }

        while(right >= 0){
            nums1[ptr] = nums2[right];
            ptr--;
            right--;
        }

        while(left >=0){
            nums1[ptr] = nums1[left];;
            ptr--;
            left--;
        }
        
    }
}