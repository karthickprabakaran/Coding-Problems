/**
 * @param {number[][]} intervals
 * @param {number[]} newInterval
 * @return {number[][]}
 */
var insert = function(intervals, newInterval) {

    let res = [];
    

    for(let interval of intervals){
        if(interval[1] < newInterval[0]){
            res.push(interval);
        }else if(interval[0] > newInterval[1]){
            res.push(newInterval);
            newInterval = interval;
        }else{
            newInterval[0] = Math.min(interval[0], newInterval[0]);
            newInterval[1] = Math.max(interval[1], newInterval[1]);
        }
    }
    res.push(newInterval);
    return res;
    
};