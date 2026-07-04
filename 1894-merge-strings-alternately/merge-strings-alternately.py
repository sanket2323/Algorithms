class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        l1,l2 = 0,0

        len1 = len(word1)
        len2= len(word2)
        merge = []
        while l1 < len1 or l2 < len2:

            if l1< len1 :
                merge.append(word1[l1])
                l1+=1

            if l2 < len2:
                merge.append(word2[l2])
                l2+=1
        merge = ''.join(merge)
        return merge
                
            

