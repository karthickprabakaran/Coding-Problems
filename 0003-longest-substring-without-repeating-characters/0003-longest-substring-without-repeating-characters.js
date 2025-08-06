/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {

    let set = new Set();

    let left = 0;
    let right = 0;
    let maxLen = 0;

    while(right < s.length){
        if(set.has(s.charAt(right))){
            set.delete(s.charAt(left));
            left++;
        }else{
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left +1);
            right++;
        }
    }

    return maxLen;
    
};