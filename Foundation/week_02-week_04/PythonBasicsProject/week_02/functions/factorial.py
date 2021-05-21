# - Create a function called `calculateFactorial()`
#   that returns the factorial of its input

num = 1


def calculate_factorial(n):
    result = 1
    for i in range(0, n+1):
        result *= i
    if n == 0:
        result = 0
    return result

print(calculate_factorial(num))

