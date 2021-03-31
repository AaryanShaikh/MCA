# maximum in a dictionary
d = {'a': 5, 'b': 10, 'c': 15, 'd': 20}
keys = list(d.keys())
values = list(d.values())
print(f"The Maximum value in the dictionary is {max(values)} with key {keys[values.index(max(values))]}")
