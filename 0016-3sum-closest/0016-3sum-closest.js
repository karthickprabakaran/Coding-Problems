/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var threeSumClosest = function(nums, target) {

    nums.sort((a,b) => a- b);

    let closest = nums[0] + nums[1] + nums[2];

    let n = nums.length;

    for(let i=0;i<n- 2;i++){
        let left = i+1;
        let right = n-1;
        
        while(left < right){

        let currentSum = nums[i] + nums[left] + nums[right];

        if(Math.abs(target - currentSum) < Math.abs(target - closest)){
            closest = currentSum;
        }

        if(currentSum < target){
            left++;
        }else if (currentSum > target){
            right--;
        }else {
            return currentSum;
        }
        }
    }
    return closest;
};