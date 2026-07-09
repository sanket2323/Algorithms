class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        
        ans = 0
        wealth = []
        for account in accounts:
            wealth.append(sum(account))

        return max(wealth)