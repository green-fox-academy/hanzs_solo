# Write a program that asks for 5 integers in a row,
# then it should print the sum and the average of these numbers like:
#
# Sum: 22, Average: 4.4
sum = 0
number_of_numbers = 5

for x in range(number_of_numbers):
    sum += int(input("enter an integer: "))

print("sum:", sum, "average:", sum / number_of_numbers)
