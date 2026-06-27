class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        # right = len(nums) - 1
        # left = 0
        # count = 0
        
        # while left < right:
        #     if nums[right] == val :
        #         right -= 1

        #     if nums[left] == val:
        #         nums[left], nums[right] = nums[right], nums[left]

        #     else:
        #         count +=1

        # return count

        k = 0 
        
        # 'i' acts as our fast pointer, scanning through the array
        for i in range(len(nums)):
            if nums[i] != val:
                nums[k] = nums[i]
                k += 1
                
        return k

        
        
