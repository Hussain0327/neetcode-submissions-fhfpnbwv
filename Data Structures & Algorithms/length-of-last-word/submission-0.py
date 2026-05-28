class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        res = []
        for word in s.split():
            res.append(word)
        return len(res[-1])