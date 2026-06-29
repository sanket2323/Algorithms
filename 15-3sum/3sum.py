class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        triplets = []
        n = len(nums)

        for i in range(n):

            if nums[i] > 0:
                break
            
            elif i > 0 and nums[i] == nums[i-1]:
                continue 
                
            left,right = i + 1,n - 1
             
            
            while  left < right:  
                sum = nums[left] + nums[right] + nums[i]
                if sum == 0:
                    triplets.append([nums[i],nums[left],nums[right]])
                    left += 1
                    right -= 1

                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    

                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1


                elif sum < 0 :
                    left += 1
                
                else:
                    right -= 1

        return triplets
        
        