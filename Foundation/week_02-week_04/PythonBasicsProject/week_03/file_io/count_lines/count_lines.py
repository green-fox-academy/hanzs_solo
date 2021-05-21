# Write a function that takes a filename as string as a parameter
# and  returns the number of lines the file contains.
# It should return zero if it can't open the file and
# should not raise any error.

def number_of_lines(file_name):
    try:
        my_file = open(file_name, 'r')
        lines = my_file.readlines()
        my_file.close()
        return len(lines)
    except IOError:
        return 0


print(number_of_lines("asd.txt"))
