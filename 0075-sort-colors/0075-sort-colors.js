/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function (nums) {
  let n = nums.length;

  let start = 0;
  let middle = 0;
  let end = n - 1;

  while (middle <= end) {
    if (nums[middle] == 1) {
      middle++;
    } else if (nums[middle] == 0) {
      let temp = nums[middle];
      nums[middle] = nums[start];
      nums[start] = temp;
      start++;
      middle++;
    } else {
      let temp = nums[middle];
      nums[middle] = nums[end];
      nums[end] = temp;
      end--;
    }
  }
};
