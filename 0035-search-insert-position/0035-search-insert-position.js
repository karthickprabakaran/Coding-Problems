/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {

    let n = nums.length;

    for(let i=0;i<n;i++){
        if(target <= nums[i]){
            return i;
        }  
    }
    return n;
    
};