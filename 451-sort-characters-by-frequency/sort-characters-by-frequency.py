class Solution:
    def frequencySort(self, s: str) -> str:
        hash_table = {}

        for ch in s:
            hash_table[ch] = hash_table.get(ch,0) + 1

        sorted_dic= sorted(hash_table.items(),key = lambda x:x[1],reverse = True)
        ans = ''
        for x in sorted_dic:
            ans += x[0] * x[1]

        return ans

