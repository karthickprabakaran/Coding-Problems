/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {

    let n = nums.length;
    let set = new Set();
    nums.sort((a,b) => a - b)
    for(let i= 0; i< n-2;i++){
        let left = i+1;
        let right = n-1;

        while(left < right){
            let sum = nums[i]+nums[left]+nums[right];

            if(sum < 0){
                left++;
            }else if(sum > 0){
                right--;
            }else{
                let list = [nums[i], nums[left], nums[right]];
                set.add(list.toString());
                left++;
                right--;
            }
        }
    }

    return [...set].map(str => str.split(',').map(Number));
    
};