ele = [10, 20, 30]

x = bytes(ele)

print(x[0])

for i in x:
    print(i)

x[0] = 55

"""
Output:
10
10
20
30
Traceback (most recent call last):
  File "F:\_ Sem 6 BCA\BCA Sem 6\CS_33_Python\006_Bytes\006_Bytes.py", line 10, in <module>
    x[0] = 55
TypeError: 'bytes' object does not support item assignment
"""