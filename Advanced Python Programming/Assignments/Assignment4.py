dict = {4: 'harsha ', 1: 'abi', 5: 'karikalan', 9: 'siddharth', 2: 'adhi', 7: 'nandini', 8: 'vanathi'}
keys = []
for i in dict.keys():
    keys.append(i)
keys.sort()
print("the key and value pair of the given dictionary whose keys are greater than the second smallest key are:")
for i in range(len(keys)):
    if i == 0 or i == 1:
        continue
    else:
        print(f"key = {keys[i]} value = {dict[keys[i]]}")
