# class student:
#     def __init__(self):
#         self.name = 'urmil'
#         self.age = 20
#         self.marks = 100
#         print('this is init method magic time')
    
#     def talk(self):
#         print('hi i am',self.name)
#         print(f'i am {self.age} years old')
#         print(f"i get {self.marks} in my last exam")


# urmil  = student()
# urmil.talk()

# class student():
#     def __init__(self,n=".",m=0):
#         self.name = n
#         self.marks = m
        
#     def display(self):
#         print("Hey",self.name)
#         print("your marks",self.marks)


# s = student()
# s.display()
# print('--------------')

# #constructor is called with 2 arguments
# s1 = student("xyz",100  )
# s1.display()
# print('-------------')

#inheritance
    #single inheritance


class College:
    def __init__(self):
        print('magic happens')
    def marks(self,marks=91):
        self.marks = marks
        print(self.marks)

class Student(College):
    def __init__(self):
        pass
    def name(self,name):
        self.name = name
        print(self.name)

obj = Student()
obj.name("urmil")
obj.marks()
