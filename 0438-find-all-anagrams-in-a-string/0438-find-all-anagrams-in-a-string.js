var findAnagrams = function(s, p) {
    const result = [];
    const pCount = new Array(26).fill(0);
    const sCount = new Array(26).fill(0);
    const a = 'a'.charCodeAt(0);

    // Build frequency count for p
    for (let i = 0; i < p.length; i++) {
        pCount[p.charCodeAt(i) - a]++;
    }

    for (let i = 0; i < s.length; i++) {
        sCount[s.charCodeAt(i) - a]++;

        // Remove the character left out of the window
        if (i >= p.length) {
            sCount[s.charCodeAt(i - p.length) - a]--;
        }

        // Compare window with pCount
        if (arraysEqual(pCount, sCount)) {
            result.push(i - p.length + 1);
        }
    }

    return result;
};

// Compare two arrays of size 26
function arraysEqual(arr1, arr2) {
    for (let i = 0; i < 26; i++) {
        if (arr1[i] !== arr2[i]) return false;
    }
    return true;
}