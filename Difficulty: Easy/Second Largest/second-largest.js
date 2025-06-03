class Solution {
    getSecondLargest(arr) {
        let firstHighest = -Infinity;
        let secondHighest = -Infinity;

        for (let num of arr) {
            if (num > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = num;
            } else if (num > secondHighest && num < firstHighest) {
                secondHighest = num;
            }
        }

        return secondHighest === -Infinity ? -1 : secondHighest;
    }
}