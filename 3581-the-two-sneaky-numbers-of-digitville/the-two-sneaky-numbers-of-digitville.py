class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        l =len(nums)
        hash_list = [0] * l 

        for num in nums:
            hash_list[num] += 1

        ans = [ i for i , val in enumerate(hash_list) if val == 2]

        return ans

        
