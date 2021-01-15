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

# modules -> packages
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

# assertions -> if true then raise error
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

# none -> null
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

# list slices -> dividing the list
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

# String Functions -> some of the functionalities of string
# print(", ".join(["spam","eggs","ham"]))
# print("Hello Me".replace("Me","World"))
# print("This is a sentence.".startswith("This"))
# print("This is a sentence.".endswith("sentence."))
# print("This is a sentence.".upper())
# print("THESE ARE ALL CAPS".lower())
# print("spam,eggs,ham".split(","))

# Numeric Functions -> some of the functionalities of numeric
# print(min(1,2,3,4,0,2,1))
# print(max(1,4,9,2,5,6,8))
# print(abs(-98))
# print(sum([1,2,3,4,5]))

# List Functions -> some of the functionalities of list
# nums = [55,44,33,22,11]
# if all([i>5 for i in nums]):
#     print("All larger than 5")
# if any([i%2==0 for i in nums]):
#     print("At least one is even")
# for v in enumerate(nums):
#     print(v)

# functional programming -> taking function as an argument and returning of the functions
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

# lambdas -> functions without the name
# named function
# def poly(x):
#     return x ** 2 + 5 * x + 4
# print(poly(-4))
# # lambda
# print((lambda x: x ** 2 + 5 * x + 4)(-4))
# double = lambda x:x*2
# print(double(7))

# map -> all the numbers get modified
# def add_five(x):
#     return x+5
# nums = [11,22,33,44,55]
# print(list(map(add_five,nums)))

# filter -> only those which meet the criteria is modified
# def div_two(x):
#     return x%2==0
# nums = [11,22,33,44,55]
# res = list(filter(div_two,nums))
# print(res)
# def less_five(x):
#     return x<5
# nums = [1,2,5,8,3,0,7]
# res = list(filter(less_five,nums))
# print(res)

# generators -> generate a list based on some criteria
# def counter():
#     i = 0
#     while i < 10:
#         yield i
#         i += 1
# for i in counter():
#     print(i)

# prime number generator
# def is_prime(x):
#     flag = True
#     i = 2
#     while i < x:
#         if x%i==0:
#             flag = False
#         i+=1
#     return flag
#
# def get_primes():
#     num = 2
#     while num <= 20:
#         if is_prime(num):
#             yield num
#         num+=1
# print(list(get_primes()))

# decorators
# def decor(func):
#     def wrap():
#         print("=---------=")
#         func()
#         print("=---------=")
#     return wrap
# @decor
# def print_text():
#     print("Hello!")
# print_text()

# recursion
# def factorial(x):
#     if x==1:
#         return 1
#     else:
#         return x * factorial(x-1)
# print(factorial(5))

# sets
# num_set = {1,2,3,4,5}
# word_set = set(["spam","eggs","sausage"])
# print(3 in num_set)
# print("spam" not in word_set)
# nums = {1,2,1,3,1,4,5,6}
# print(nums)
# nums.add(-7)
# nums.remove(3)
# print(nums)
# first = {1,2,3,4,5,6}
# second = {4,5,6,7,8,9}
# print(first|second)
# print(first&second)
# print(first-second)
# print(second-first)
# print(first^second)

# itertools
# from itertools import count
# for i in count(3):
#     print(i)
#     if i >=11:
#         break

# from itertools import accumulate,takewhile
# nums = list(accumulate(range(8))) #0+0,0+1,1+2,3+3,6+4,10+5
# print(nums)
# def less_six(x):
#     return x<6
# print(list(takewhile(less_six,nums)))

# from itertools import product,permutations
# letters = ("A","B","C")
# print(list(product(letters,range(2))))
# print(list(permutations(letters)))

# classes & objects
# class Cat:
#     def __init__(self,color,legs):
#         self.color = color
#         self.legs = legs
# felix = Cat("ginger",4)
# print(felix.color)
# class Dog:
#     def __init__(self,name,color):
#         self.name = name
#         self.color = color
#
#     def bark(self):
#         print("Woof!")
# fido = Dog("Fido","brown")
# print(fido.color)
# fido.bark()

# inheritance
# class Animal:
#     def __init__(self,name,color):
#         self.name = name
#         self.color = color
#
# class Cat(Animal):
#     def purr(self):
#         print("purr..")
#
# class Dog(Animal):
#     def bark(self):
#         print("bark")
# fido = Dog("Bhawesh","black")
# print("The Dog's name is {x} and it's color is {y}".format(x=fido.name,y=fido.color))

# overriding
# class Wolf:
#     def __init__(self,name,color):
#         self.name = name
#         self.color = color
#     def bark(self):
#         print("Grr..")
#
# class Dog(Wolf):
#     def bark(self):
#         print("Bark")
#
# husky = Dog("Max","grey")
# husky.bark()

# magic methods
# class Vector2D:
#     def __init__(self,x,y):
#         self.x = x
#         self.y = y
#     def __add__(self, other):
#         return Vector2D(self.x+other.x,self.y+other.y)`
# first = Vector2D(5,7)
# second = Vector2D(3,9)
# result = first + second
# print(result.x)
# print(result.y)

# list of magic methods
# __sub__ for -
# __mul__ for *
# __truediv__ for /
# __floordiv__ for //
# __mod__ for %
# __pow__ for **
# __and__ for &
# __xor__ for ^
# __or__ for |

# class SpecialString:
#     def __init__(self,text):
#         self.text = text
#     def __truediv__(self, other):
#         line = "-"*len(other.text)
#         return "\n".join([self.text,line,other.text])
# spam = SpecialString("Hi")
# spam2 = SpecialString("Aaryan")
# print(spam/spam2)

# Data Hiding
# class Spam:
#     __egg = 7
#     def print_egg(self):
#         print(self.__egg)
#
# s=Spam()
# s.print_egg()
# print(s._Spam__egg)
# print(s.__egg)

# Class Methods
# class Rectangle:
#     def __init__(self,width,height):
#         self.width = width
#         self.height = height
#
#     def calculate(self):
#         return self.width * self.height
#
#     @classmethod
#     def square(cls,side):
#         return cls(side,side)
#
# sqr = Rectangle.square(4)
# rec = Rectangle(4,2)
# print("The area of the square is {x}".format(x=sqr.calculate()))
# print("The area of the rectangle is {x}".format(x=rec.calculate()))

# Static methods
# class Pizza:
#     def __init__(self,toppins):
#         self.toppins = toppins
#
#     @staticmethod
#     def validate(topping):
#         if topping == "pineapple":
#             raise ValueError("No pineapples allowed")
#         else:
#             return True
# incredients = ["cheeze","onions","spam"]
# if all(Pizza.validate(i) for i in incredients):
#     pizza = Pizza(incredients)

# properties
# class Pizza:
#     def __init__(self,toppins):
#         self.toppins = toppins
#         self._pineapple_allowed = False
#
#     @property
#     def pineapple_allowed(self):
#         return self._pineapple_allowed
#
#     @pineapple_allowed.setter
#     def pineapple_allowed(self,value):
#         password = input("Enter the password:")
#         if password == "CypherCoding...":
#             self._pineapple_allowed = value
#         else:
#             raise ValueError("Alert! Intruder")
#
# pizza = Pizza(["cheese","tomato"])
# print(pizza.pineapple_allowed)
# pizza.pineapple_allowed = True
# print(pizza.pineapple_allowed)

# regular expressions
# import re
# pattern = r"spam"
# text = "eggspamsausagespam"
# if re.match(pattern,text):
#     print("match")
# else:
#     print("No match")
# if re.search(pattern,text):
#     print("Match")
#     match = re.search(pattern,text)
#     print(match.group())
#     print(match.start())
#     print(match.end())
#     print(match.span())
# else:
#     print("No match")
# print(re.findall(pattern,text))
# str = "My name is Aaryan. Hy Aaryan!"
# pattern = r"Aaryan"
# newstr = re.sub(pattern,"Cypher",str)
# print(newstr)

# Metacharacters
import re
# pattern = r"gr.y"
# if re.match(pattern,"grey"):
#     print("Match 1")
# if re.match(pattern,"gray"):
#     print("Match 2")
# if re.match(pattern,"red"):
#     print("Match 3")
# pattern = r"^gr.y$"
# if re.match(pattern,"grey"):
#     print("Match 1")
# if re.match(pattern,"gray"):
#     print("Match 2")
# if re.match(pattern,"grty"):
#     print("Match 3")

# * -> zero or more repetition
# pat = r"egg(spam)*"
# if re.match(pat,"egg"):
#     print("Match 1")
# if re.match(pat,"eggspamspamegg"):
#     print("Match 2")
# if re.match(pat,"spam"):
#     print("Match 3")

# + -> one or more repetition
# pat = r"g+"
# if re.match(pat,"g"):
#     print("Match 1")
# if re.match(pat,"gggggg"):
#     print("Match 2")
# if re.match(pat,"abc"):
#     print("Match 3")

# ? -> zero or one repetition
# pat = r"ice(-)?cream"
# if re.match(pat,"ice-cream"):
#     print("Match 1")
# if re.match(pat,"icecream"):
#     print("Match 2")
# if re.match(pat,"ice--cream"):
#     print("Match 3")

# {a,b} between a and b
# pat = r"9{1,3}$"
# if re.match(pat,"9"):
#     print("Match 1")
# if re.match(pat,"999"):
#     print("Match 2")
# if re.match(pat,"9999"):
#     print("Match 3")

# character classes
# import re
# pat = r"[aeiou]"
# if re.search(pat,"grey"):
#     print("Match 1")
# if re.search(pat,"qwertyuiop"):
#     print("Match 2")
# if re.search(pat,"rythm myths"):
#     print("Match 3")
# # character wise searching
# pat = r"[A-Z][A-Z][0-9]"
# if re.search(pat,"LS8"):
#     print("Match 1")
# if re.search(pat,"E3"):
#     print("Match 2")
# if re.search(pat,"ab3"):
#     print("Match 3")
# # inverting/except for the included ones
# pat = r"[^A-Z]"
# if re.search(pat,"everyone is anime"):
#     print("Match 1")
# if re.search(pat,"CYPH3R"):
#     print("Match 2")
# if re.search(pat,"ALLCAPS"):
#     print("Match 3")

# groups
# import re
# pat = r"a(bc)(de)(f(g)h)i"
# match = re.match(pat,"abcdefghijklmnop")
# if match:
#     print(match.group())
#     print(match.group(0))
#     print(match.group(1))
#     print(match.group(2))
#     print(match.groups())

# pat = r"(?P<first>abc)(?:def)(ghi)"
# match = re.match(pat,"abcdefghi")
# if match:
#     print(match.group("first"))
#     print(match.groups())

# pat = r"gr(a|e)y"
# match = re.match(pat,"gray")
# if match:
#     print("Match 1")
# match = re.match(pat,"grey")
# if match:
#     print("Match 2")
# match = re.match(pat,"griy")
# if match:
#     print("Match 3")
