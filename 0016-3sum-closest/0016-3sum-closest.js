var threeSumClosest = function(nums, target) {
    nums.sort((a, b) => a - b); // Sort the array
    let closestSum = nums[0] + nums[1] + nums[2]; // Initialize with first possible triplet

    for (let i = 0; i < nums.length - 2; i++) {
        let left = i + 1;
        let right = nums.length - 1;

        while (left < right) {
            let currentSum = nums[i] + nums[left] + nums[right];

            // Update closestSum if current is closer to target
            if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                closestSum = currentSum;
            }

            if (currentSum < target) {
                left++;
            } else if (currentSum > target) {
                right--;
            } else {
                // Exact match found
                return currentSum;
            }
        }
    }

    return closestSum;
};