# Write a program that reads a number from the standard input, then draws a
# pyramid like this:
#
#
#    *
#   ***
#  *****
# *******
#
# The pyramid should have as many lines as the number was

height = int(input("pyramid height: "))
for x in range(1, height):
    print(" " * (height - x) + "*" * (x * 2 - 1))
