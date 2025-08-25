var groupAnagrams = function(strs) {

  let map = new Map();
  for (let str of strs) {
    let cur = str.split('').sort().join('');

    if (!map.has(cur)) {
      map.set(cur, []);
    }
    map.get(cur).push(str);
  }

  return Array.from(map.values());
};
