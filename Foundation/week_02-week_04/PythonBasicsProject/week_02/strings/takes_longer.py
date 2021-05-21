# When saving this quote a disk error has occured. Please fix it!
# Insert the words "always takes longer than" between the words "It" and "you"!

quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law."

a = quote.find("It")
quote = quote[:a + 2] + " always takes longer than" + quote[a + 2:]
print(quote)
