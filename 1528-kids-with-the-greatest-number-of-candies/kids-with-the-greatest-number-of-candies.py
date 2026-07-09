class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        max_val = max(candies)
        ans = [True if candie + extraCandies >= max_val else False for candie in candies ]

        return ans