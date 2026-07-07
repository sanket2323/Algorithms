class Solution:
    def recoverOrder(self, order: List[int], friends: List[int]) -> List[int]:
        
        hash_freq = [0] * 101
        ans = []

        for f in friends:
            hash_freq[f] += 1

        for o in order:

            if hash_freq[o] > 0:
                ans.append(o)
        return ans
