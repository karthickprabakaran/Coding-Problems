class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        n = len(nums)
        count = 0

        for i in range(n):
            if((i < n -1) and nums[i] == nums[i+1]):
                continue
            else:
                nums[count] = nums[i]
                count+=1
        return count
        