class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen = set()
        for i in range(len(nums)):
            if nums[i] in seen:
                return True
                seen.append(i + 1)
            if nums[i] not in seen:
                seen.add(nums[i])
        else:
            return False