/**
 * @param {string} s
 * @return {number}
 */
var myAtoi = function(s) {

    let i = 0 ;
    let sign = 1;
    let ans = 0;
    const INT_MAX = 2**31 -1;
    const INT_MIN = -(2**31);

    while( i < s.length && s[i] === ' ')i++;

    if(s[i] === '-' || s[i]==='+'){
        sign = s[i] === '-' ? -1 : 1;
        i++
    }

    while(i < s.length && s[i] >= '0' && s[i] <= '9'){
        let digit = s[i].charCodeAt(0)  - '0'.charCodeAt(0);

        ans = ans* 10 + digit;

        if(sign === 1 && ans > INT_MAX) return INT_MAX;
        if(sign === -1 && -ans < INT_MIN) return INT_MIN;
        i++;
    }

    return sign * ans;


    
};