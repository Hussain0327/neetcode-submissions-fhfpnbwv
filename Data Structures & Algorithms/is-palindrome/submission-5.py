class Solution:
    def isPalindrome(self, s: str) -> bool:
        cleaned = []
        for char in s:
            if char.isalnum():
                lower = char.lower()
                cleaned.append(lower)
        clean = "".join(cleaned)
        
        l = 0
        r = len(clean) - 1
        while l < r:
            if clean[l] != clean[r]:
                return False

            l += 1
            r -= 1
        return True