var twoSum = function (nums, target) {
  let n = nums.length;

  let map = new Map();

  for (let i = 0; i < n; i++) {
    let req = target - nums[i];

    if (map.has(req)) {
      return [map.get(req), i];
    }

    map.set(nums[i], i);
  }

  return [-1, -1];
};
