class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        copyNums = []
        for i in nums:
            if (i != val):
                copyNums.append(i)
        nums[:len(copyNums)] = copyNums
        return len(copyNums)