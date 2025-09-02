/**
 * @param {number[]} nums
 * @return {string}
 */
var largestNumber = function(nums) {

    let strs = nums.map(String);

    strs.sort((a, b) => {
        return (b+a).localeCompare(a+b);
    })

    let res = strs.join("");

    if(res[0] === "0") return "0";

    return res;
    
};