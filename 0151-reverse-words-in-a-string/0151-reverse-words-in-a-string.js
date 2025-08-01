/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    let words = s.trim().split(/\s+/);  // Split on one or more spaces
    let res = "";

    for (let i = words.length - 1; i >= 0; i--) {
        res += words[i];
        if (i > 0) res += " ";  // Avoid trailing space
    }

    return res;
};