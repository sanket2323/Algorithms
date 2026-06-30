class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        result = 0
        for n in num:
            result = result * 10 + n
        total = result + k
        
        output= []
        while total:
            output.append(total%10)
            total //= 10
        

        return output[::-1]