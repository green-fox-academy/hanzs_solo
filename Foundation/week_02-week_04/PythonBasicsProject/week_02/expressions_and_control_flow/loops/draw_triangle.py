# Write a program that reads a number from the standard input, then draws a
# triangle like this:
#
# *
# **
# ***
# ****
#
# The triangle should have as many lines as the number was

h = int(input("triangle height: "))
for x in range(1, h):
    print("*" * x)

