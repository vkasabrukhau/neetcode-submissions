class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        counter = 0
        maximum = 0
        for i in nums:
            if (i == 1): counter += 1
            if (counter >= maximum): maximum = counter
            if (i != 1): counter = 0
        return maximum