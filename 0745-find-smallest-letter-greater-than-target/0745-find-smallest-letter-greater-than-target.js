var nextGreatestLetter = function(letters, target) {
    let low = 0;
    let high = letters.length - 1;

    while(low <= high){
        let mid = Math.floor((low + high) / 2);

        if(letters[mid] <= target){
            low = mid + 1;   // move right
        } else {
            high = mid - 1;      // include mid, it might be the answer
        }
    }

    // Wrap around if target >= all letters
    return letters[low % letters.length];
};