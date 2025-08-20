var isAnagram = function(s, t) {

  return s.trim('').split('').sort().join('') === t.trim('').split('').sort().join('');



};
