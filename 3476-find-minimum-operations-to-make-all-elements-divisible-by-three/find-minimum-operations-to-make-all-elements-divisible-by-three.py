class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        oper = 0

        for num in nums:

            if num % 3 == 1 or num % 3 == 2:
                oper += 1

        return oper

        