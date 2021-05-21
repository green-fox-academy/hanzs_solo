# Create a program that asks for two numbers
# If the second number is not bigger than the first one it should print:
# "The second number should be bigger"
#
# If it is bigger it should count from the first number to the second by one
#
# example:
#
# first number: 3, second number: 6, should print:
#
# 3
# 4
# 5
a = -999
b = -1999
while a > b:
    if a != -999:
        print("\nthe second number should be bigger")
    a = int(input("gimme a number to count from: "))
    b = int(input("gimme a number to count to: "))

while a < b:
    print(a)
    a += 1

# for x in range(b):
#     if x < a:
#         continue
#     print(x)
