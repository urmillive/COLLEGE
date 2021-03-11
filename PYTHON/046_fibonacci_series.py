# 0 1 1 2 3 5 8...
f1 = 0
f2 = 1
for i in range(1,11):
    if i == 1:
        print(f1)
    elif i == 2:
        print(f2)
    else:
        f3 = f1 + f2
        print(f3)
        f1 = f2
        f2 = f3

'''
0
1
1
2
3
5
8
13
21
34
'''