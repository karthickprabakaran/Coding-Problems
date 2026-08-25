class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = {}

        for i, num in enumerate(nums):
            required = target - num

            if required in hashMap:
                return [hashMap[required], i]

            hashMap[num] = i

        return []