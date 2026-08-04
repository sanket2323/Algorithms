class Solution:
    def removeOuterParentheses(self, s: str) -> str:

        count = 0
        req_ans = ""

        for p in s: 
            
            if p == "(":
                if count >= 1:
                    req_ans += p
                count += 1
            
            else:
                count -= 1
                if count >= 1:
                    req_ans += p

            

        return req_ans