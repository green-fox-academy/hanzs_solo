# Create a function that divides number 10
# by a number that's passed as a paramater and prints the result.
# It should print "fail" if the parameter is 0

def divide_ten_by(n):
    try:
        print(10 / n)
    except ZeroDivisionError:
        print("fail")


divide_ten_by(0)
