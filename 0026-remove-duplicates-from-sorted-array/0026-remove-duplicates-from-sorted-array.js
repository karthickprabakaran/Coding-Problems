/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {

    let n = nums.length;

    let left = 0;

    for(let i=1;i<n;i++){
        if(nums[left] !== nums[i]){
            left++;
            nums[left] = nums[i];
        }
    }

    return left +1;
    
};