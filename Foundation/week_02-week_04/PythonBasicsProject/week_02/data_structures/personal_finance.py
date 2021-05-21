# Personal finance
# We are going to represent our expenses in a list containing integers
# - Create a list with the following items.
#   - 500, 1000, 1250, 175, 800 and 120
expenses = [500, 1000, 1250, 175, 800, 120]


# - Create an application which solves the following problems.
#   - How much did we spend?
def total():
    sum = 0
    for expense in expenses:
        sum += expense
    return sum


print(total())


#   - Which was our greatest expense?
def greatest():
    greatest_expense = 0
    for expense in expenses:
        if expense > greatest_expense:
            greatest_expense = expense
    return greatest_expense


print(greatest())


#   - Which was our cheapest spending?
def cheapest():
    cheapest_expense = greatest()
    for expense in expenses:
        if expense < cheapest_expense:
            cheapest_expense = expense
    return cheapest_expense


print(cheapest())


#   - What was the average amount of our spendings?
def average():
    return total() / len(expenses)


print(average())
