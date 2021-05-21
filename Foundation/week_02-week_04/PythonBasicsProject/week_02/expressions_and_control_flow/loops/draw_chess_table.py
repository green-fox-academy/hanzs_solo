# Crate a program that draws a chess table like this
#
# % % % %
#  % % % %
# % % % %
#  % % % %
# % % % %
#  % % % %
# % % % %
#  % % % %
#

for y in range(8):
    for x in range(8):
        if y % 2 == 0:
            if x % 2 == 0:
                print(" # ", end="")
            else:
                print("   ", end="")
        else:
            if x % 2 != 0:
                print(" # ", end="")
            else:
                print("   ", end="")
    print()
