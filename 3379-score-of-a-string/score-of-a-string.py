class Solution:
    def scoreOfString(self, s: str) -> int:
        nums = []

        for char in s:
            nums.append(ord(char))
        sum = 0
        len_nums = len(nums)
        for i in range(len_nums):
            if i + 1 < len_nums :
                ab = abs(nums[i] - nums[i+1])
                sum += ab

        return sum