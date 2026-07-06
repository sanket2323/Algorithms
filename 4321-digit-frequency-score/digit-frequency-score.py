class Solution:
    def digitFrequencyScore(self, n: int) -> int:
        count = 0
        
        while n > 0:
             
            last_di = n % 10 
            count += last_di
            n = n//10

        return count

        