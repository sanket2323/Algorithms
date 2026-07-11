class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        
        ls = len(s)

        for i in range(ls):
            new_s = s[-i:] + s[:-i]

            if new_s == goal: 
                return True

        return False
            