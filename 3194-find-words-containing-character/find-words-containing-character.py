class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        ans = []
        le = len(words)
        for i in range(le):
            if x in words[i]:
                ans.append(i)

        return ans