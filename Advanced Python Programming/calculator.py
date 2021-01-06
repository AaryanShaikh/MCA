x = int(input("Enter the First Number:"))
y = int(input("Enter the Second Number:"))
op = input("Enter the operation to perform:")
if (op == "+"):
    res = x + y
    print(res)
elif (op == "-"):
    res = x - y
    print(res)
elif (op == "x"):
    res = x * y
    print(res)
else:
    res = x / y
    print(res)
