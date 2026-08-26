class Solution:
    def threeSum(self, nums):
        nums.sort()
        result = set()
        n = len(nums)

        i = 0

        while i < n - 2:
            left = i + 1
            right = n - 1

            while left < right:
                total = nums[i] + nums[left] + nums[right]

                if total < 0:
                    left += 1

                elif total > 0:
                    right -= 1

                else:
                    result.add((nums[i], nums[left], nums[right]))
                    left += 1
                    right -= 1

            i += 1

        return [list(triplet) for triplet in result]