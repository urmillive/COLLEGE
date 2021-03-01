s = {10 , 20, 30, 20, 40}
print(s)
lst = [1, 2, 3, 2]
s = set(lst)
print(s)
s.update([4])
print(s)
s.remove(2)
print(s)
s[0]=50 #Error

"""
Output :
{40, 10, 20, 30}
{1, 2, 3}
{1, 2, 3, 4}
{1, 3, 4}
Traceback (most recent call last): --- Error
"""