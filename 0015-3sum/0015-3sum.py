class Solution:
    def threeSum(self, nums):
        nums.sort()
        result = []

        n = len(nums)

        for i in range(n - 2):

            # Skip duplicate values for the first number
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            left = i + 1
            right = n - 1

            while left < right:
                total = nums[i] + nums[left] + nums[right]

                if total < 0:
                    left += 1

                elif total > 0:
                    right -= 1

                else:
                    result.append([nums[i], nums[left], nums[right]])

                    # Move both pointers
                    left += 1
                    right -= 1

                    # Skip duplicate values on the left
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1

                    # Skip duplicate values on the right
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1

        return result