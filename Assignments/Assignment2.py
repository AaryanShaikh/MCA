file = open("input.txt", "r")
data = file.read().replace('\n', '').replace('(', '').replace(')', '').replace(',', '').replace('.', '').replace('\"','').lower()
words = set()
for i in data.split():
    words.add(i)
for i in words:
    count = 0
    for j in data.split(" "):
        if i == j:
            count += 1
    print(f"the word '{i}' has occured {count} times in the file.")
