/**
 * @param {number} n
 * @return {string}
 */
var countAndSay = function(n) {

    let curr = "1";

    for(let i=1;i<n;i++){
        let next = "";
        let j = 0;
        while(j < curr.length){
            let currentCount = 1;
            while( j < curr.length -1 && curr.charAt(j) == curr.charAt(j+1)){
                currentCount +=1;
                j++;
            }
            next += currentCount.toString() + curr[j];
            j++;
        }
        curr = next;
    }
    return curr;
};