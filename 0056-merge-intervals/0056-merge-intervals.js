/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function(intervals) {

    intervals.sort((a,b) => a[0] - b[0]);

    let res = [intervals[0]];

    for(let i=0;i<intervals.length;i++){
        let last = res[res.length -1];
        let current = intervals[i];

        if(current[0] <= last[1]){
            last[1] = Math.max(last[1], current[1]);
        }else{
            res.push(current);
        }
    }

    return res;
    
};