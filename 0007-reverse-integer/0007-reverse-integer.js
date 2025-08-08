/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {

    let n = Math.abs(x);
    let ans = 0;
    while(n > 0){
        let digit = n%10;   
        n = Math.floor(n/10);
        ans = ans * 10 + digit;
    }

    if(x < 0) ans = -ans;

    if(ans < -(2**31) || ans > 2**31 -1) return 0;

    return ans;    
};