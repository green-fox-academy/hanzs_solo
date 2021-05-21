# - Create a function called `print_params`
#   which prints the input parameters
#   (can have multiple number of arguments)

def print_params(*args):
    for i in range(len(args)):
        print(args[i])


print_params(1, 2, 3, "aasdf", "aapape")
