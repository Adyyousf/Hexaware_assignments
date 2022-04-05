# class Fystudent:
#     def __init__(self,name,age):
#         self.name=name
#         self.age=age
#     def details(self):
#         print(f"Student is {self.name} and {self.age}  years old")
#     def Exam(self):
#         print("First Year  Final Examination")
# class Systudent:
#     def __init__(self,name,age):
#         self.name=name
#         self.age=age
#     def details(self):
#         print(f"Student is {self.name} and {self.age}  years old")
#     def Exam(self):
#         print("Second Year  Final Examination")
# FystudentObj=Fystudent("Manish",20)
# SystudentObj=Systudent("Tina",21)
# for student in (FystudentObj,SystudentObj):
#     student.Exam()
#     student.details()

class parent:
    def __init__(self,parentname):
        self.parentname=parentname
    def disp(self):
        return self.parentname
 
class daughter(parent):
    def __init__(self, parentname, daughtername):
        super().__init__(parentname)
        self.daughtername=daughtername
    def fullname(self):
        return self.daughtername+ " " +self.parentname
 
class son(parent):
    def __init__(self, parentname,sonname):
        super().__init__(parentname)
        self.sonname=sonname
    def fullname(self):
        return self.sonname+ " " +self.parentname
 
pname=parent("Paul")
print("Parent Name is ",pname.disp())
dfname =daughter("Paul","Celina")
print("Daughter's full name is ",dfname.fullname())
sfname =son("Paul","Sam")
print("Son's full name is ",sfname.fullname())
