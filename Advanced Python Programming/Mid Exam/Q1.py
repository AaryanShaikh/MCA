word = "all languages are equal"
alpha = "a"
count = 0
for i in range(len(word)):
    if word[i] == alpha:
        count+=1
print(count)