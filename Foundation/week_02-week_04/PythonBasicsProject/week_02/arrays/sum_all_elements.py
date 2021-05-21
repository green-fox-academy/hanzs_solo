# - Create a variable named `numbers`
#   with the following content: `[3, 4, 5, 6, 7]`
# - Print the sum of the elements of `numbers`

numbers = [3, 4, 5, 6, 7]
sum = 0
for i in range(len(numbers)):
    sum += numbers[i]
print(sum)
