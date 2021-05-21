# Write a function that is able to manipulate a file
# by writing your name into it as a single line.
# The file should be named "my-my_file.txt".
# In case the program is unable to write the file,
# it should print the following error message: "Unable to write file: my-my_file.txt"

def manipulator(name):
    try:
        my_file = open("my_file.txt", 'w')
        my_file.write(name)
        my_file.close()
    except IOError:
        print("you are an idiot")


manipulator("hanzs_solo")
