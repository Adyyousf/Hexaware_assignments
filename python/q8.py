# Q8. Write a program to display the spell of a digit accepted from user (like user input 0 and display ZERO and so on)

while True:
    a = int(input("Enter a digit or \'ctrl + c' to exit: "))
    if a == 0 :
        print("Zero")
    elif a == 1 :
        print("One")
    elif a == 2 :
        print("Two")
    elif a == 3 :
        print("Three")
    elif a == 4 :
        print("Four")
    elif a == 5 :
        print("Five")
    elif a == 6 :
        print("Six")
    elif a == 7 :
        print("Seven")
    elif a == 8 :
        print("Eight")
    elif a == 9 :
        print("Nine")
    else :
        print("More spellings soon :) ")