var topKFrequent = function(nums, k) {
    let map = new Map();

    // Count frequencies
    for (let num of nums) {
        map.set(num, (map.get(num) || 0) + 1);
    }

    // Initialize buckets: index = frequency
    let count = new Array(nums.length + 1).fill(0).map(() => []);

    for (let [num, freq] of map.entries()) {
        count[freq].push(num);
    }

    // Collect top k frequent elements
    let res = [];
    for (let i = nums.length; i >= 0 && res.length < k; i--) {
        if (count[i].length > 0) {
            res.push(...count[i]);
        }
    }

    return res.slice(0, k); // Just in case we added extra elements
};