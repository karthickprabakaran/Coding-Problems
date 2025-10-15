var isPalindrome = function (s) {

let res = s.replace(/[^0-9a-zA-Z]/g, '').toLowerCase(); 

  let reversed = res.split('').reverse().join('');

  return reversed === res;
};
