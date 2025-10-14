/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {

    let map = new Map();

    for(let num of nums){
        map.set(num, (map.get(num) || 0) + 1);
    }

    let freq = new Array(nums.length + 1).fill(0).map(() => []);

    for(let [num, fre] of map.entries()){
        freq[fre].push(num);
    }

    let res = [];

    for(let i = nums.length;i>=0;i--){
        if(freq[i].length > 0){
            res.push(...freq[i]);
        }
    }

    return res.slice(0,k);
    
};