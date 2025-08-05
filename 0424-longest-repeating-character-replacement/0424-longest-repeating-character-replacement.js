/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 */
var characterReplacement = function(s, k) {

    let freq = new Array(26).fill(0); 
    let left = 0;
    let maxFreq = 0;
    let maxWindow  = 0;

    for(let right = 0;right < s.length;right++){
        freq[s.charCodeAt(right) - 65]++;

        maxFreq = Math.max(maxFreq, freq[s.charCodeAt(right) - 65]);

        let windowLength = right - left + 1;

        if(windowLength - maxFreq > k){
            freq[s.charCodeAt(left) - 65]--; 
            left++;
        }

        windowLength = right - left +1;
        maxWindow = Math.max(maxWindow, windowLength);
    }

    return maxWindow;
    
};