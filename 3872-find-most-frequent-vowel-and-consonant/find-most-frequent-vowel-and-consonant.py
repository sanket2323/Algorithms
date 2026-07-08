class Solution:
    def maxFreqSum(self, s: str) -> int:
        
        hash_list = [0] * 26
        vowel ='aeiou'
        max_v, max_c = 0,0

        for char in s:
            i = ord(char) - ord('a')
            hash_list[i] += 1

            if char in vowel:
                max_v = max(max_v,hash_list[i])
            
            else:
                max_c = max(max_c,hash_list[i])

        return max_v + max_c

        

        