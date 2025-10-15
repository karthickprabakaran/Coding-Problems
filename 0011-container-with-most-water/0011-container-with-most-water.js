var maxArea = function (height) {
  let left = 0;
  let right = height.length - 1;

  let max = 0;

  while (left < right) {
    let curr = Math.min(height[left], height[right]) * (right - left);
    if (curr > max) max = curr;

    if (height[left] < height[right]) {
      left++;
    } else {
      right--;
    }
  }

  return max;
};
