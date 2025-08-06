/**
 * @param {string} s
 * @param {number} k
 * @returns {number}
 */
class Solution {
    longestKSubstr(s, k) {
        let maxLen = -1;
        let map = new Map();
        let left = 0;
        let right = 0;

        while (right < s.length) {
            let char = s.charAt(right);
            map.set(char, (map.get(char) || 0) + 1);
            right++;

            while (map.size > k) {
                let leftChar = s.charAt(left);
                map.set(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) === 0) {
                    map.delete(leftChar);
                }
                left++;
            }

            if (map.size === k) {
                maxLen = Math.max(maxLen, right - left);
            }
        }

        return maxLen;
    }
}