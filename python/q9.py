# Q8. Write a program to whether a number (accepted from user) is divisible by 2 and 3 both.

a = int(input("Enter a Number : "))

if (a%2 == 0) & (a%3 == 0):
    print(f"{a} is divisible by 2 and 3 ")
else:
    print(f"{a} is not divisible by 2 and 3")
