class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        "Need to remove 0s and place nums2 in instead, then mergesort nums1"
        j = 0
        for i in range(m, len(nums1)):
            nums1[i] = nums2[j]
            j += 1
                
        nums1.sort()