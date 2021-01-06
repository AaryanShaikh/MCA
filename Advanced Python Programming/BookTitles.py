file = open("usercode/files/books.txt", "r")
lines = file.readlines()
counter = 1
for i in lines:
    if (counter < len(lines)):
        print(i[0] + str(len(i) - 1))
        counter = counter + 1
    else:
        print(i[0] + str(len(i)))
file.close()
