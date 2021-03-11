def sum(a,b):
    return a+b

print(sum(10,23))

# odd even check function
def oddEven(x):
    if x%2==1:
        print('odd')
    else:
        print('even')

# factorial calculation using functions
def fact(x):
    foo=1
    for i in range(x,0,-1):
        foo *= i
    print(foo)

fact(5)

def sum_sub_mul_div(a,b):
    return a+b,a-b,a*b,a/b

foo = sum_sub_mul_div(10,5)
for i in foo[:2]:
    print(i)



def grocery(item,price="80.30"):
    return item+" = "+str(price)

print(grocery("Oil"))# positional arguments
print(grocery("Price",80.25)) # keywords arguments
print(grocery("Suger")) # default arguments


def add(fooarg,*args):
    sum=0
    for i in args:
        sum+=i
    print(fooarg+sum)

add(5,2)
add(15,5,50)

'''
33
120
15
5
Oil = 80.30
Price = 80.25
Suger = 80.30
7
70
'''