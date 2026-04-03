class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        lookup = {}  # This dictionary will store number -> index.

        for i, num in enumerate(nums):
            diff = target - num  # What number do we need to reach the target?
            if diff in lookup:
                return [lookup[diff], i]  # Found the pair!
            lookup[num] = i  # Store this number and its index for future lookups.
