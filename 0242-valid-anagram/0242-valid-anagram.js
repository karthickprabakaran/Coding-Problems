    var isAnagram = function(s, t) {



    let arr = new Array(26).fill(0);

    for (let char of s) {
        arr[char.charCodeAt(0) - "a".charCodeAt(0)]++;
    }

    for (let char of t) {
        arr[char.charCodeAt(0) - "a".charCodeAt(0)]--;
    }

    for (let num of arr) {
        if (num !== 0) return false;
    }

    return true;

    };
