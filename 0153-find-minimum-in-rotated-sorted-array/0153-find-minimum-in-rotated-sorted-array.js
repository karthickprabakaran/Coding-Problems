/**
 * @param {number[]} nums
 * @return {number}
 */
var findMin = function(nums) {

    let min = Infinity;

    for(let i=0;i<nums.length;i++){
        if(nums[i] < min){
            min = nums[i];
        }
    }

    return min;
    
};