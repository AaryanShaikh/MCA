file = open("garbage.txt", "r")
text = file.read()


def count_char(char, text):
    counter = 0
    for i in text:
        if (i == char):
            counter += 1
    return counter


for i in "abcdefghijklmnopqrstuvwxyz":
    percent = 100 * count_char(i, text) / len(text)
    print("{x} occupies {y}% of the text".format(x=i, y=round(percent, 2)))
