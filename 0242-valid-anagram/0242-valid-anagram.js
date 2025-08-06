/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {

    let freq = Array(128).fill(0);

    for(let i=0;i<s.length;i++){
        freq[s.charCodeAt(i)]++;
    }

    for(let i=0;i<t.length;i++){
        freq[t.charCodeAt(i)]--;
    }

    for(let num of freq){
        if(num !== 0) return false;
    }

    return true;


};