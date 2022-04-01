def maxx(a, b):
    if a >= b:
        return a
    else:
        return b


a = int(input("Enter first Number: "))
b = int(input("Enter Second number: "))
print(f"The bigger number is : {maxx(a, b)}")
