# # List introduction 1
#
# We are going to play with lists. Feel free to use the built-in methods where
# possible.
#
# - Create an empty list which will contain names (strings)
# - Print out the number of elements in the list
# - Add William to the list
# - Print out whether the list is empty or not
# - Add John to the list
# - Add Amanda to the list
# - Print out the number of elements in the list
# - Print out the 3rd element
# - Iterate through the list and print out each name
#   ```text
#   William
#   John
#   Amanda
#   ```
# - Iterate through the list and print
#   ```text
#   1. William
#   2. John
#   3. Amanda
#   ```
# - Remove the 2nd element
# - Iterate through the list in a reversed order and print out each name
#   ```text
#   Amanda
#   William
#   ```
# - Remove all elements

names = []
print(len(names))
print()

names.append("William")
print(len(names))
print()

print(len(names) == 0)
print()

names.append("John")
names.append("Amanda")
print(len(names))
print()

print(names[2])
print()

for name in names:
    print(name)
print()

for i in range(len(names)):
    print(i + 1, ".", names[i])
print()

names.remove(names[1])
i = len(names) - 1
while i >= 0:
    print(names[i])
    i -= 1
print()

names[:] = []
