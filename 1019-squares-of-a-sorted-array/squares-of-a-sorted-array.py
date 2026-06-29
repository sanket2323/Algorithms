class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        squares = [num * num for num in nums]
        sorted= []
        left = 0
        right = len(nums) - 1

        while right >= left:
            
            if squares[left] < squares[right]:
                sorted.append(squares[right])
                right -= 1
            
            else: 
                sorted.append(squares[left])
                left += 1
            
        sorted.reverse()

        return sorted
            

