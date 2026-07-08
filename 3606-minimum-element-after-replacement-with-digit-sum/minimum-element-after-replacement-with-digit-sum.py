class Solution:
    def minElement(self, nums: List[int]) -> int:
        
        l = len(nums)

        for i in range(l):

            if nums[i] > 9:
                sum = 0
                num = nums[i]
                while num > 0:

                    sum += num % 10
                    num = num //10

                nums[i] = sum 

        min_val = min(nums)

        return min_val            