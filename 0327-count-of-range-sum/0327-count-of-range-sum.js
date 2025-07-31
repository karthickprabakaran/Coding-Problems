/**
 * @param {number[]} nums
 * @param {number} lower
 * @param {number} upper
 * @return {number}
 */
var countRangeSum = function(nums, lower, upper) {
    const sums = [0];
    for (let num of nums) {
        sums.push(sums[sums.length - 1] + num);
    }

    return countWhileMergeSort(sums, 0, sums.length, lower, upper);
};

function countWhileMergeSort(sums, start, end, lower, upper) {
    if (end - start <= 1) return 0;

    const mid = Math.floor((start + end) / 2);
    let count = countWhileMergeSort(sums, start, mid, lower, upper) +
                countWhileMergeSort(sums, mid, end, lower, upper);

    let j = mid, k = mid, t = mid;
    const temp = [];
    let r = 0;

    for (let i = start; i < mid; i++) {
        // Find range [sums[k] - sums[i] >= lower]
        while (k < end && sums[k] - sums[i] < lower) k++;
        while (j < end && sums[j] - sums[i] <= upper) j++;
        count += j - k;

        // Merge sorted halves
        while (t < end && sums[t] < sums[i]) temp[r++] = sums[t++];
        temp[r++] = sums[i];
    }

    // Copy remaining elements from right half
    while (t < end) temp[r++] = sums[t++];

    // Copy sorted temp back into sums
    for (let i = 0; i < temp.length; i++) {
        sums[start + i] = temp[i];
    }

    return count;
}