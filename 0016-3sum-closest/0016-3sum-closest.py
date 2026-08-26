class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        n = len(nums)
        nums.sort()

        result = nums[0] + nums[1] + nums[2]
        minDifference = math.inf

        i = 0

        while i < n - 2:
            left = i + 1
            right = n - 1

            while left < right:
                current_sum = nums[i] + nums[left] + nums[right]
                difference = abs(current_sum - target)

                if difference < minDifference:
                    result = current_sum
                    minDifference = difference

                if current_sum < target:
                    left += 1
                elif current_sum > target:
                    right -= 1
                else:
                    return current_sum

            i += 1

        return result