for i in range(1,11):
    print(i,end=" ")

for i in range(1,11,2):
    print(i,end=" ")

list = ['namo','jamo','gamo','dhamo',24,14.23,True]
for l in list:
    print(l,end=" ")
print()

for x in "urmil":
  print(x)

#nested for loop
adj = ["red", "big", "tasty"]
fruits = ["apple", "banana", "cherry"]

for x in adj:
  for y in fruits:
    print(x, y)

dictionary = {
    'name':'urmil',
    'city':'hathigadh'
}
for x in dictionary:
    print(x,dictionary[x])

'''

1 2 3 4 5 6 7 8 9 10 1 3 5 7 9 namo jamo gamo dhamo 24 14.23 True 
u
r
m
i
l
red apple
red banana
red cherry
big apple
big banana
big cherry
tasty apple
tasty banana
tasty cherry
name urmil
city hathigadh
'''