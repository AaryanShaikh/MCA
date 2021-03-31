import numpy as np
def avg(arr):
    sum = 0
    for i in range(len(arr)):
        sum+=arr[i]
    return sum/len(arr)

def mean(arr):
    return np.mean(arr)

def std(arr):
    return np.std(arr)