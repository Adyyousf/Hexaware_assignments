#Q1. Write a program to check whether a number entered is three digit number or not.

n = int(input("Enter Number:  "))

if (n > 99) & (n < 1000):
    print("number entered is three digit") 
else:
    print("Not a three digit number")
