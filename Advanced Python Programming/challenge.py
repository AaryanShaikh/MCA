# challenge 1
spam = "7"
spam = spam + "0"
eggs = int(spam) + 3
print(float(eggs))

# challenge 2
x = 5
y = x + 3
y = int(str(y) + "2")
print(y)

# challenge 3
x = 3
num = 17
print(num % x)

# challenge 4
if not True:
    print("1")
elif not (1 + 1 == 3):
    print("2")
else:
    print("3")

# challenge 5
x = 4
y = 2
if not 1 + 1 == y or x == 4 and 7 == 8:
    print("yes")
elif x > y:
    print("No")

# challenge 6
nums = [10, 9, 8, 7, 6, 5]
nums[0] = nums[1] - 5
if 4 in nums:
    print(nums[3])
else:
    print(nums[4])

# challenge 7
nums = list(range(5))
print(nums[4])

# challenge 8
nums = list(range(5, 8))
print(len(nums))


# challenge 9
def print_double(x):
    print(2 * x)


print_double(3)


# challenge 10
def print_numbers():
    print(1)
    print(2)
    return
    print(4)
    print(6)


print_numbers()


# challenge 11
def print_nums(x):
    for i in range(x):
        print(i)
        return


print_nums(10)


# challenge 12
def func(x):
    res = 0
    for i in range(x):
        res += i
        return res


print(func(4))

# challenge 13
try:
    print(1)
except:
    print(2)
finally:
    print(3)

# challenge 14
try:
    print(1)
    print(20 / 0)
    print(2)
except ZeroDivisionError:
    print(3)
finally:
    print(4)

# challenge 15
try:
    print(1)
    assert 2 + 2 == 5
except AssertionError:
    print(3)
except:
    print(4)

# challenge 16
tuple = (1, (1, 2, 3))
print(tuple[1])

# challenge 17
sqs = [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
print(sqs[4:7])
print(sqs[1::4])
print(sqs[7:5:-1])

# challenge 18
print("{0}{1}{0}".format("abra", "cad"))

# challenge 19
str = "{c},{b},{a}".format(a=5, b=9, c=7)
print(str)

# challenge 20
print(min([sum([11, 22]), max(abs(-30), 2)]))

# challenge 21
nums = [-1, 2, -3, 4, -5]
if all([abs(i) < 3 for i in nums]):
    print(1)
else:
    print(2)

# challenge 22
nums = (55, 44, 33, 22)
print(max(min(nums[:2]), abs(-42)))


# challenge 23
def test(func, arg):
    return func(func(arg))
def mult(x):
    return x * x
print(test(mult, 2))

# challenge 24
triple = lambda x:x*3
add = lambda x,y:x+y
print(add(triple(3),4))

# challenge 25
def make_word():
    word = ""
    for ch in "spam":
        word += ch
        yield word
print(list(make_word()))

# challlenge 26
def fib(x):
    if x==0 or x==1:
        return 1
    else:
        return fib(x-1)+fib(x-2)
print(fib(4))

# challenge 27
letters = {"a","b","c","d"}
if "e" not in letters:
    print(1)
else:
    print(2)

# challenge 28
a = {1,2,3}
b = {0,3,4,5}
print(a&b)

# challenge 29
from itertools import product
a = {1,2}
print(len(list(product(range(3),a))))

# challenge 30
nums = {1,2,3,4,5,6}
nums = {0,1,2,3} & nums
nums = filter(lambda x:x>1,nums)
print(len(list(nums)))

# challenge 31
def power(x,y):
    if y==0:
        return 1
    else:
        return x*power(x,y-1)
print(power(2,3))

# challenge 32
class A:
    def method(self):
        print(1)
class B:
    def method(self):
        print(2)
B().method()

# challenge 33
class A:
    def a(self):
        print(1)
class B(A):
    def a(self):
        print(2)
class C(B):
    def c(B):
        print(3)
c = C()
c.a()

# challenge 33
import re
pat = r"1(23)(4(56)78)9(0)"
match = re.match(pat,"1234567890")
if match:
    print(match.group(3))

# challenge 34
pat = r"(a)(b(?:c)(d)(?:e))"
match = re.match(pat,"abcde")
if match:
    print(len(match.groups()))
