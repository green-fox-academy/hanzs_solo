# Create a list ('List A') which contains the following values
# Apple, Avocado, Blueberries, Durian, Lychee
list_a = ["Apple", "Avocado", "Blueberries", "Durian", "Lychee"]

# Create a new list ('List B') with the values of List A
list_b = list_a

# Print out whether List A contains Durian or not
print("Durian" in list_a)

# Remove Durian from List B
list_b.remove("Durian")

# Add Kiwifruit to List A after the 4th element
list_a.append("Kiwifruit")

# Compare the size of List A and List B
if len(list_a) > len(list_b):
    print("list_a is bigger")
else:
    print("list_b is bigger")

# Get the index of Avocado from List A
if "Avocado" in list_a:
    list_a.index("Avocado")

# Get the index of Durian from List B
if "Durian" in list_b:
    list_b.index("Durian")

# Add Passion Fruit and Pomelo to List B in a single statement
list_b += ["Passion Fruit", "Pomelo"]

# Print out the 3rd element from List A
print(list_a[2])
