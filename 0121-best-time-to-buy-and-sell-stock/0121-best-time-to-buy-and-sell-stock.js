var maxProfit = function (prices) {
  let n = prices.length;

  let max = 0;
  let currentLowest = prices[0];

  for (let i = 0; i < n; i++) {
    if (prices[i] < currentLowest) currentLowest = prices[i];

    max = Math.max(max, prices[i] - currentLowest);
  }

  return max;
};
