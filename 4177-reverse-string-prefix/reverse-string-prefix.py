class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        res = s[k-1::-1] + s[k:]
        return res