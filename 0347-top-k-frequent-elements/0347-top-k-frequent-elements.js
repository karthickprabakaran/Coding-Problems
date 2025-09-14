var topKFrequent = function(nums, k) {
  let map = new Map();

  // Step 1: Count frequencies
  for (let num of nums) {
    map.set(num, (map.get(num) || 0) + 1);
  }

  // Step 2: Create buckets (size = nums.length + 1)
  let buckets = Array(nums.length + 1).fill().map(() => []);

  for (let [num, freq] of map.entries()) {
    buckets[freq].push(num);
  }

  // Step 3: Gather results from the highest frequency down
  let res = [];
  for (let i = buckets.length - 1; i >= 0 && res.length < k; i--) {
    if (buckets[i].length > 0) {
      res.push(...buckets[i]);
    }
  }

  return res.slice(0, k);
};