class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        
        left_sum = []
        right_sum =[]

        l = len(nums)

        for i in range(l):

            sum_l,sum_r = 0 , 0

            sum_l = sum(nums[:i])
            sum_r = sum(nums[i+1:])
            left_sum.append(sum_l)
            right_sum.append(sum_r)

        final_ans = [
            abs(a-b) for a,b in zip(left_sum,right_sum)
        ]

        return final_ans
            