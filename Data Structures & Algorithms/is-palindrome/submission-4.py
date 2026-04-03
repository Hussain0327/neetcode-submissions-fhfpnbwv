class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean = ''.join(c.lower() for c in s if c.isalnum())  
        rev = clean[::-1]                                     
        return clean == rev                                  
# Keep only alphanumeric, lowercase it all.
# Reverse the cleaned string.
 # True if palindrome, else False.