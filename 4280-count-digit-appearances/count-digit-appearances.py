class Solution:
    def countDigitOccurrences(self, nums: list[int], digit: int) -> int:

        count = 0
        digit = str(digit)
        for num in nums: 
            num = str(num)

            for n in num:
                if digit in n: 
                    count += 1

        return count
        