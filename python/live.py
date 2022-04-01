from math import sqrt

# class Car:
#     #protected
#     _modelName= "BMW"
#     _gear = "Automatic"
#     _price = 1000000
#     def __init__(self,m,g,p):
#         self._modelName=m
#         self._gear=g
#         self._price=p
#     def _myCarDetails(self):
#         print(self._modelName,self._gear,self._price)
# class BMWCar(Car):
#     def __init__(self,m,g,p):
#         Car.__init__(self,m,g,p)
#     def displayBMW(self,n):
#         self.n=n
#         print(self.n)
#         self._myCarDetails()

# bmw=BMWCar("xyz","SemiAutomatic",50000)
# bmw.displayBMW("newName")

class Triangle:
    def __init__(self,a, b, c):
        self.a = a
        self.b = b
        self.c = c
 
    def Triangle_area(self):
        s = (self.a + self.b + self.c)/2
        area = (s*(s-self.a)*(s-self.b)*(s-self.c))**0.5
        return area
 
 
#input three side from user
a = float(input('Please Enter length of first side: '))
b = float(input('Please Enter length of second side: '))
c = float(input('Please Enter length of third side: '))
 
 
#creating object of classTriangle
obj = Triangle(a,b,c)
 
#calling the class method Triangle_area()
print("Area of triangle : {}".format(obj.Triangle_area()))
