class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # Return True if there are duplicates, False otherwise
        return len(nums) != len(set(nums))


# Testing outside the class
def has_duplicates(nums):
    return len(nums) != len(set(nums))


list_with_duplicates = [1, 2, 3, 3]
list_without_duplicates = [1, 2, 3, 4]

print(has_duplicates(list_with_duplicates))   # True
print(has_duplicates(list_without_duplicates)) # False
