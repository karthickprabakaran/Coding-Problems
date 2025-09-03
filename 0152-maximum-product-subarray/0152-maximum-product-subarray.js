/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function(nums) {

    let max = -Infinity;

    for(let i=0;i<nums.length;i++){
        let prod = 1;
        for(let j=i;j<nums.length;j++){
            prod *= nums[j];
            if(prod > max) max = prod;
        }
    }

    return max;
    
};