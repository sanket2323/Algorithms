class Solution:
    def maxDistinct(self, s: str) -> int:
        set_s = set(s)

        return len(set_s)