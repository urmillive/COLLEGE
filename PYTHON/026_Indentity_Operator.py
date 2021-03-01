a=10
b=20
c=30

print("address->",id(a))
print("address->",id(b))
a=c
print("address->",id(c))
print("")

if a is c:
    print("a and c are same")
else:
    print("a and c are different")

'''
address-> 2922834324048
address-> 2922834324368
address-> 2922834324688

a and c are same
'''