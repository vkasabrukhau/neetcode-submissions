class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        biggest = -1
        index = len(arr) - 1
        for i in range(index, -1, -1):
            if(arr[i] > biggest):
                newbiggest = arr[i]
                arr[i] = biggest
                biggest = newbiggest
            else: arr[i] = biggest
        

        return arr