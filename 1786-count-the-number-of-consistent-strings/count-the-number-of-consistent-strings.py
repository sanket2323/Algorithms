class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        # hash_list = [0] * 26
        # count = len(words)
        # for ch in allowed:
        #     char_index = ord(ch) - ord('a')
        #     hash_list[char_index] = 1

        # for word in words:
        #     for ch in word:
        #         ch_index = ord(ch) - ord('a')

        #         if hash_list[ch_index] == 0:
        #             count -= 1
        #             break

        # return count

        # one more solution

        count = len(words)
        allowed_set = set(allowed)

        for word in words:
            for ch in word:

                if ch not in allowed_set:
                    count -= 1
                    break

        return count 

        