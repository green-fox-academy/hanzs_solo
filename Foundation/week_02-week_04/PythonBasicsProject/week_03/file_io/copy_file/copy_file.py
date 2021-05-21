# Write a function that copies the contents of a file into another file
# It should take two filenames as parameters
# It should return a boolean that shows if the copy was successful

def foo(file1, file2):
    try:
        source_file = open(file1,'r')
        new_file = open(file2,'w')
        new_file.write(source_file.read())
        return True
    except IOError:
        return False


print(foo("my_file.txt", "my_another_file.txt"))