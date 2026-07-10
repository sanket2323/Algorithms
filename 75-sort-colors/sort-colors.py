class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        le = len(nums)

        for i in range(le):

            for j in range(le - 1 -i):

                if nums[j] > nums[j + 1]:
                    nums[j],nums[j+1] = nums[j+1],nums[j]

        return None
