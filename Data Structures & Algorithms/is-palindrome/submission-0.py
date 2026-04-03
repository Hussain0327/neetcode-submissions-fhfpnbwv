class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean = ''.join(c.lower() for c in s if c.isalnum())
        rev = clean[::-1]
        if clean == rev:
            return True
        else:
            return False