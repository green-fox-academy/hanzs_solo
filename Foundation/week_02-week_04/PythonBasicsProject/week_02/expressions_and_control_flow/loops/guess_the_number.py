# Write a program that stores a number and the user has to figure it out
# The user can input guesses
# After each guess the program would tell one of the following:
#
# The stored number is higher
# The stried number is lower
# You found the number: 8

stored_number = 8
number = int(input("guess the stored number: "))

while number != stored_number:
    if number < stored_number:
        print("the stored number is higher")
    if number > stored_number:
        print("the stored number is lower")
    number = int(input("\nguess the stored number: "))

print("you found the number: ", stored_number)
