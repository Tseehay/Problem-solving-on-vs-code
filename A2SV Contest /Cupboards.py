class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        words = ""
        i, j = 0, 0
        while i < len(word1) and j < len(word2):
            words += word1[i]
            i += 1
            words += word2[j]
            j += 1
        words += word1[i:]
        words += word2[j:]
        return words
