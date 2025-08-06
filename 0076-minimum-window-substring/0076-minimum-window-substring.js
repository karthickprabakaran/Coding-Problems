/**
 * @param {string} s
 * @param {string} t
 * @return {string}
 */
var minWindow = function(s, t) {

    let left = 0;
    let right  = 0;
    let count =0;
    let minLen = Infinity;
    let startIndex = -1;
    let required = t.length;
    let hash = new Array(128).fill(0);

    for(let i=0;i<t.length;i++){
        hash[t.charCodeAt(i)]++;
    }

    while(right < s.length){
        if(hash[s.charCodeAt(right)] > 0){
            count++;
        }
        hash[s.charCodeAt(right)]--;
        right++;

        while(count === required){
            if(right - left < minLen){
                minLen = right - left;
                startIndex = left;
            }
            hash[s.charCodeAt(left)]++;
            if(hash[s.charCodeAt(left)] > 0) count--;
            left++;
        }
    }

    return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLen);

    
};