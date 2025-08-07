/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    let max = "";

    for (let i = 0; i < s.length; i++) {
        expandAroundCenter(i, i);     // Odd-length
        expandAroundCenter(i, i + 1); // Even-length
    }

    function expandAroundCenter(left, right) {
        while (left >= 0 && right < s.length && s[left] === s[right]) {
            let subStr = s.slice(left, right + 1);
            if (subStr.length > max.length) {
                max = subStr;
            }
            left--;
            right++;
        }
    }

    return max;
};