text = input()
texts = text.split(" ")
max = 0
for i in texts:
    if len(i) > max:
        max = len(i)
        text = i
print(text)
