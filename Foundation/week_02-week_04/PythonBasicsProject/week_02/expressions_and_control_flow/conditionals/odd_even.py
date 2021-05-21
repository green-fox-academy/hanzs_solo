# Write a program that reads a number from the standard input,
# then prints "Odd" if the number is odd, or "Even" if it is even.

number = int(input("enter an integer: "))
if number % 2 == 0:
    print("Even")
else:
    print("Odd")
