var findMin = function (nums) {
  let min = nums[0];

  for (let char of nums) {
    if (char < min) min = char;
  }

  return min;
};
