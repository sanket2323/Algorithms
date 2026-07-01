class Solution:
    def reverseVowels(self, s: str) -> str:
        start = 0
        end = len(s) - 1
        s = list(s)
        vowel_list = ['a','e','i','o','u']

        while start < end:

            if s[start].lower() not in vowel_list  :
                start += 1

            elif s[end].lower() not in vowel_list:
                end -= 1

            else:
                temp = s[start]
                s[start] = s[end]
                s[end] = temp 

                start += 1
                end -= 1

                #in python u can swap 
                # s[start],s[end] = s[end], s[start]
            
        return ''.join(s)