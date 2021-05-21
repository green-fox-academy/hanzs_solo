# Write a function called `sum()` that returns the sum of numbers from zero to the given parameter

n = 6255763


def sum(n):
    sum = 0
    for i in range(n):
        sum += i
    return sum


print(sum(n))
