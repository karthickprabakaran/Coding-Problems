var twoSum = function(nums, target) {
  let n = nums.length;

  let map = new Map();

  for (let i = 0; i < n; i++) {
    let diff = target - nums[i];

    if (map.has(diff)) return [map.get(diff),i];

    map.set(nums[i], i);

  }
  return [-1, -1];

};
