s = "Hello\nWorld!"
print(s)

def ty(t):
    print(type(t))

ty(10)

ty(5.16)

ty(5j)

ty("urmil")

ty(None)

ty(False)

ty([10, 20])

ty((10, 20))

ty({10, 20})

ty(range(10))

"""
Output :
Hello
World!
<class 'int'>
<class 'float'>
<class 'complex'>
<class 'str'>
<class 'NoneType'>
<class 'bool'>
<class 'list'>
<class 'tuple'>
<class 'set'>
<class 'range'>
"""