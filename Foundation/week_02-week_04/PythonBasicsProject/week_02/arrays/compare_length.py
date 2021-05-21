# - Create a variable named `firstArrayOfNumbers`
#   with the following content: `[1, 2, 3]`
# - Create a variable named `secondArrayOfNumbers`
#   with the following content: `[4, 5]`
# - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
#   elements than `firstArrayOfNumbers`
# - Otherwise print: "firstArrayOfNumbers is the longer one"

fist_array_of_numbers = [1, 2, 3]
second_array_of_numbers = [4, 5]

if len(fist_array_of_numbers) > len(second_array_of_numbers):
    print("fist_array_of_numbers is longer")
else:
    print("second_array_of_numbers is longer")
