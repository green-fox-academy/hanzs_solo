# Write a program that opens a file called "my-my_file.txt" and prints
# each line from the file.
# If the program is unable to read the file (for example it does not exist),
# it should print the following error message: "Unable to read file: my-my_file.txt"

try:
    my_file = open("my-file.txt", 'r')
    print(my_file.read())
    my_file.close()
except IOError:
    print("Unable to read file: my-my_file.txt")
