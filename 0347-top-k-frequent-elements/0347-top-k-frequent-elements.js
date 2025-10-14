var topKFrequent = function (nums, k) {


let map = new Map();

for(let num of nums){
    map.set(num, (map.get(num) || 0) + 1);
  }

  let freq =  Array.from(map.entries());

  freq.sort((a,b) => {
  return (b[1] - a[1]);
  });

  let res = [];

  for(let i=0;i<k;i++){
  res.push(freq[i][0]);
  }

  return res;





};
