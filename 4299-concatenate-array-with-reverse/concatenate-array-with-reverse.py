class Solution:
    def concatWithReverse(self, nums: list[int]) -> list[int]:
        total_len = len(nums) * 2
        ans = [None] * total_len
        left = 0 
        right = total_len - 1
        
        while left < right: 

            ans[left] = nums[left]
            ans[right] = nums[left]

            left += 1
            right -= 1

        return ans