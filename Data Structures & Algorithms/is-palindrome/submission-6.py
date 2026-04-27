class Solution:
    def isPalindrome(self, s: str) -> bool:
        res = []
        for char in s:
            char = char.lower()
            if char.isalnum():
                res.append(char)

        left, right = 0, len(res) -1
        while left < right:
            if res[left] != res[right]:
                return False
            
            left += 1
            right -= 1
        return True