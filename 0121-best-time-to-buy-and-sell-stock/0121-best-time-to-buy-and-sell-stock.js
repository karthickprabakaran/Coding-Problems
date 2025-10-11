/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
  let n = prices.length;
  let max = -Infinity;
  let currentLowest = prices[0];
  for (let i = 0; i < n; i++) {
    if (prices[i] < currentLowest) currentLowest = prices[i];
    else {
      let profit = prices[i] - currentLowest;
      if (profit > max) max = profit;
    }
  }

  return max;
};

