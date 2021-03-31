import numpy as np

arr = np.array([[4, 5, 8], [7, 1, 45], [42, 27, 13]])
arr2 = []
for x in np.nditer(arr):
    arr2.append(x)
arr2.sort()
print(f"The Third Biggest number is {arr2[len(arr2) - 3]}")
