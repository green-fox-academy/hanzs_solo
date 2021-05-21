# - Create a variable named `numbers`
#   with the following content: `[3, 4, 5, 6, 7]`
# - Reverse the order of the elements of `numbers`
# - Print the elements of the reversed `numbers`

numbers = [3, 4, 5, 6, 7]
temp = []
for i in range(len(numbers)):
    temp.append(numbers[len(numbers)-i-1])
numbers = temp
print(numbers)