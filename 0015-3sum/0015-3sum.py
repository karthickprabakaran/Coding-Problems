class Solution:
    def threeSum(self, nums):
        n = len(nums)
        nums.sort()

        i = 0
        result = set()

        
        for i in range(n):
            left = i+1
            right = n-1
            while(left < right):
                    if(nums[i] + nums[left]+ nums[right]) < 0:
                        left+=1
                    elif (nums[i] + nums[left] + nums[right]) > 0:
                        right-=1
                    else:
                        triplet = (nums[i], nums[left], nums[right])
                        result.add(triplet)
                        left+=1
                        right-=1
        
        return [list(t) for t in result]