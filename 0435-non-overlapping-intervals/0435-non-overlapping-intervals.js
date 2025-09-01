/**
 * @param {number[][]} intervals
 * @return {number}
 */
var eraseOverlapIntervals = function(intervals) {

    let cnt = 0 ;
    intervals.sort((a,b) => a[1] - b[1]); 
    let end = -Infinity;

    for(let [start, finish] of intervals){
        if(start < end){
            cnt++;
        }else{
            end = finish;
        }
    }

    return cnt;
    
};