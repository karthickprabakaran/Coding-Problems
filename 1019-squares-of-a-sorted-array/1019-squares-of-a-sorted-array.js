var sortedSquares = function(nums) {
    let n = nums.length;
    let left = 0, right = n - 1, pos = n - 1;
    let res = new Array(n);

    while (left <= right) {
        if (Math.abs(nums[left]) > Math.abs(nums[right])) {
            res[pos] = nums[left] * nums[left];
            left++;
        } else {
            res[pos] = nums[right] * nums[right];
            right--;
        }
        pos--;
    }
    return res;
};