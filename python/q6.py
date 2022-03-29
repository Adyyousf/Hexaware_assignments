# Q6. Write a program to check whether a number (accepted from user) is positive or negative.

a = int(input("Enter a number: "))

if a < 0:
    print(f"{a} is Negative.")
elif a == 0 :
    print(f"{a} is zero")
else:
    print(f"{a} is positive")