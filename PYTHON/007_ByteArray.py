ele = [10, 20, 30]

x = bytearray(ele)

print(x[0])

for i in x:
    print(i)

x[0] = 55

print(x)

print(x[0])

"""
Output:
10
10
20
30
bytearray(b'7\x14\x1e')
55
"""