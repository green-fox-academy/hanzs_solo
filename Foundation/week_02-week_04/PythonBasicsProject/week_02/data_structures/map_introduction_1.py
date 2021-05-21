# Map introduction 1

# We are going to play with maps. Feel free to use the built-in methods where possible.
# Create an empty map where the keys are integers and the values are characters
my_dict = {}

# Print out whether the map is empty or not
print(len(my_dict) == 0)

# Add the following key-value pairs to the map
# Key	Value
# 97	a
# 98	b
# 99	c
# 65	A
# 66	B
# 67	C
my_dict[97] = "a"
my_dict[98] = "b"
my_dict[99] = "c"
my_dict[65] = "A"
my_dict.update({66: "B"})
my_dict.update({67: "C"})

# Print all the keys
for key in my_dict.keys():
    print(key)

# Print all the values
for value in my_dict.values():
    print(value)

# Add value D with the key 68
my_dict.update({68: "D"})

# Print how many key-value pairs are in the map
print(len(my_dict))

# Print the value that is associated with key 99
print(my_dict[99])

# Remove the key-value pair where with key 97
my_dict.pop(97)

# Print whether there is an associated value with key 100 or not
print(100 in my_dict)

# Remove all the key-value pairs
my_dict.clear()
