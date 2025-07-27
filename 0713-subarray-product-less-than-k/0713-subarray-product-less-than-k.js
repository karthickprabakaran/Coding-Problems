/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var numSubarrayProductLessThanK = function(nums, k) {

    let count = 0;
    let left = 0;
    let product =1;

    if(k <= 1){
        return 0;
    }

    for(let right = 0;right < nums.length;right++){
        
        product = product * nums[right];

        while(product >=k){
            product = product / nums[left];
            left++;
        }

        count += right - left +1;
    }

    return count;
    
};