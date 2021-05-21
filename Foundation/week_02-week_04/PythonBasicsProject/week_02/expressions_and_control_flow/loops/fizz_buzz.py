# Write a program that prints the numbers from 1 to 100
# but for multiples of three print “Fizz” instead of the number
# and for the multiples of five print “Buzz”
# For numbers which are multiples of both three and five print “FizzBuzz”

x = 1
while x < 101:
    if x % 3 == 0:
        print("Fizz")
    elif x % 5 == 0:
        print("Buzz")
    else:
        print(x)
    x += 1
