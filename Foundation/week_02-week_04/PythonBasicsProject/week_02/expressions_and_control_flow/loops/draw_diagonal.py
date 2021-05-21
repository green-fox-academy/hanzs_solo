# Write a program that reads a number from the standard input, then draws a
# square like this:
#
#
# %%%%%
# %%  %
# % % %
# %  %%
# %   %
# %%%%%
#
# The square should have as many lines as the number was
n = int(input("n: "))
for x in range(n):
    for y in range(n):
        if x == 0 or x == n - 1 or y == 0 or y == n - 1 or x == y:
            print(" * ", end="")
        else:
            print("   ", end="")
    print()
