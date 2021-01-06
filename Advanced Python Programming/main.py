# string manipulation
# print('i\'m trying to understand python')
# print("spam" * 3)
# print(4 * '2')

# variables
# x = 7
# print(x)
# print(x + 3)
# print(x)
# x = "this is a string"
# print(x+"!")

# user input
# x = input()
# print(x)
# name = input("Enter your name: ")
# print("Hello, "+ name)
# age = int(input())
# print(age + 10)

# in-place operators
# x = 2
# print(x)
# x+=3
# print(x)
# x=4
# x*=3
# print(x)
# x="a"
# x*=3
# print(x)

# comparators
# print(1==1 and 2==2)
# print(1!=1 or 2==2)
# print(not 1>7)

# lists
# nums = [5,4,3,2,1]
# print(nums[1])
# number = 3
# things = ["string ",0,[1,2,number],4,56]
# print(things[1])
# print(things[2])
# print(things[2][2])

# lists operation
# nums = [1,2,3]
# print(nums + [4,5,6])
# print(nums*3)
# words = ["spam","egg","spam","sausage"]
# print("spam" in words)
# print("egg" in words)
# print("tomato" in words)
# print("tomato" not in words)
# print(not "tomato" in words)

# list functions
# nums = [1,2,3]
# nums.append(4)
# print(nums)
# print(len(nums))
# index = 1
# nums.insert(index,"is")
# print(nums)
# print(nums.index(3))

# while loops
# i = 1
# while (i <= 5):
#     print(i)
#     i = i + 1
# print("Finished!")
# x = 1
# while (x < 10):
#     x += 1
#     if (x == 3):
#         print("Skipping 3")
#         continue
#     if (x == 7):
#         print("Breaking")
#         continue
#     elif (x%2==0):
#         print(str(x) + " is even")
#     else:
#         print(str(x) + " is odd")

# for loops
# words = ["hello","world","spam","eggs"]
# for w in words:
#     print(w + "!")

# range
# numbers = list(range(10))
# print(numbers)
# numbers = list(range(3,8))
# print(numbers)
# print(range(20) == range(0,20))
# numbers = list(range(5,20,2))
# print(numbers)
# for i in range(5):
#     print("hello!")
# for i in range(0,20,2):
#     print(i)

# functions
# def sayHi():
#     print("Hi!")
# sayHi()
# def sayHi2(word):
#     print(word+"!")
# sayHi2("Aaryan")
# def sum(x,y):
#     print(x+y)
# sum(10,20)

# returning functions
# def max(x,y):
#     if (x>y):
#         return x
#     else:
#         return y
# print(max(2,10))

# modules
# import random
# for i in range(5):
#     value = random.randint(1,6)
#     print(value)
# import math
# num = 10
# print(math.sqrt(num))
# from math import pi
# print(pi)
# from math import sqrt as square_root
# print(square_root(100))

# exception handling
# try:
#     num1 = 7
#     num2 = 0
#     print(num1/num2)
#     print("Done Calculation")
# except ZeroDivisionError:
#     print("An error occured")
# try:
#     var = 10
#     print(var+"hello")
#     print(var/2)
# except ZeroDivisionError:
#     print("Divided by Zero")
# except (ValueError, TypeError):
#     print("Error occured")
# except:
#     print("Catching all exception")
# try:
#     print("Hello")
#     print(1/0)
# except:
#     print("Error occured")
# finally:
#     print("This code will run no matter what")

# raising exception
# num = input(":")
# if (float(num)<0):
#     raise ValueError("Negative!")

# assertions
# print(1)
# assert 2 + 2 == 4
# print(2)
# assert 1 + 1 == 3
# print(3)
# def my_func(x):
#     assert x>0,"error!"
#     print(x)
# my_func(-5)

# Opening Files
# file = open("test.txt","w") # write mode
# file = open("test.txt","r") # read mode
# file = open("test.txt","wb") # binary write mode
# file.close()

# Reading Files
# file = open("test.txt","r")
# print(file.read(12))
# print(file.read(5))
# print(file.read(1))
# print(file.read())
# file.close()
# file = open("test.txt","r")
# for line in file:
#     print(line)
# file.close()
# print(len(open("test.txt").readlines()))

# Writing Files
# file = open("test.txt","w")
# file.write("this is written using python")
# file.close()
# file = open("test.txt","r")
# print(file.read())
# file.close()
# msg = input("Enter what you want to enter to the file:")
# file = open("test.txt","w")
# amtWritten = file.write(msg)
# print("There were "+str(amtWritten)+" characters written in the file")
# file.close()

# just testing my skills...
# filename = input("Enter the file name you want to open:")
# file = open(filename+".txt","r")
# text = input("Enter the text you want to enter in the file\n")
# print("Reading the orignal content")
# print(file.read())
# file.close()
# file = open(filename+".txt","w")
# file.write(text)
# file.close()
# file = open(filename+".txt","r")
# print("Reading the new content")
# print(file.read())
# file.close()

# none
# foo = print()
# if foo==None:
#     print(1)
# else:
#     print(2)

# dictionaries
# ages = {"Dave":24,"Mary":42,"John":58}
# print(ages["Dave"])
# print(ages["Mary"])

# tuples
# words = ("spam", "eggs", "sausages")
# print(words[1])
# mytuple = "one", "two", "three"
# print(mytuple[0])

# list slices
# squares = [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
# print(squares[2:6])
# print(squares[3:8])
# print(squares[0:1])
# print(squares[:7])
# print(squares[7:])
# print(squares[::2])
# print(squares[2:8:3])

# list comprehensions
# cubes = [i ** 3 for i in range(5)]
# print(cubes)
# evens = [i ** 2 for i in range(10) if i ** 2 % 2 == 0]
# print(evens)

# String formatting
# nums = [4,5,6]
# msg = "Numbers:{0} {1} {2}".format(nums[0],nums[1],nums[2])
# print(msg)
# a = "{x},{y}".format(x=5,y=12)
# print(a)

# String Functions
# print(", ".join(["spam","eggs","ham"]))
# print("Hello Me".replace("Me","World"))
# print("This is a sentence.".startswith("This"))
# print("This is a sentence.".endswith("sentence."))
# print("This is a sentence.".upper())
# print("THESE ARE ALL CAPS".lower())
# print("spam,eggs,ham".split(","))

# Numeric Functions
# print(min(1,2,3,4,0,2,1))
# print(max(1,4,9,2,5,6,8))
# print(abs(-98))
# print(sum([1,2,3,4,5]))

# List Functions
# nums = [55,44,33,22,11]
# if all([i>5 for i in nums]):
#     print("All larger than 5")
# if any([i%2==0 for i in nums]):
#     print("At least one is even")
# for v in enumerate(nums):
#     print(v)

# functional programming
# def apply_twice(func,arg):
#     return func(func(arg))
# def add_five(x):
#     return x+5
# print(apply_twice(add_five,10))

# pure functions
# def pure_functions(x,y):
#     temp = x+2*y
#     return temp/(2*x+y)
# print(pure_functions(2,3))

# lambdas
# named function
# def poly(x):
#     return x ** 2 + 5 * x + 4
# print(poly(-4))
# # lambda
# print((lambda x: x ** 2 + 5 * x + 4)(-4))
# double = lambda x:x*2
# print(double(7))
