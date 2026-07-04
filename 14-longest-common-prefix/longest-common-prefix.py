class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        i = 0
        min_len = float('inf')

        for s in strs:
            l = len(s)
            if l < min_len:
                min_len = l

        while i < min_len:

            for s in strs:
                if s[i] != strs[0][i]:
                    return s[:i]
            i += 1

        return s[:i]
        