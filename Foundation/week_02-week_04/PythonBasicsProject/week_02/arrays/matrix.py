# - Create a two dimensional list dynamically with the following content.
#   Note that a two dimensional list is often called matrix if every
#   internal list has the same length.
#   Use a loop!
#
#   1 0 0 0
#   0 1 0 0
#   0 0 1 0
#   0 0 0 1
#
#   Its length should depend on a variable
#
# - Print this two dimensional list to the output
from array import array

n = int(input("n: "))

matrix = array([n][n])

for y in range(n):
    for x in range(n):
        matrix[y][x] = 0

