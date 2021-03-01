from sys import argv
x=1;y=5
print("even sum=",sum([x for x in [int(y) for y in argv[1:1]] if x%2 ==1]))

print("odd sum=",sum([x for x in [int(y) for y in argv[1:1]] if x%2 ==1]))