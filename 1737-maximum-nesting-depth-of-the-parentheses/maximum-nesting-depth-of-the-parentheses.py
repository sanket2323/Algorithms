class Solution:
    def maxDepth(self, s: str) -> int:
        max_depth = 0
        balance = 0

        for p in s:

            if p == '(':
                balance += 1
            
            if balance > max_depth:
                max_depth = balance

            if p == ')':
                balance -= 1

        return max_depth


        