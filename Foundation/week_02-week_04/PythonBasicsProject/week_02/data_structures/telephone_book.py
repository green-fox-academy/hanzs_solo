# # Telephone book
#
# We are going to represent our contacts in a map where the keys are going to be
# strings and the values are going to be strings as well.
# - Create a map with the following key-value pairs.
#   | Name (key)          | Phone number (value) |
#   | :------------------ | :------------------- |
#   | William A. Lathan   | 405-709-1865         |
#   | John K. Miller      | 402-247-8568         |
#   | Hortensia E. Foster | 606-481-6467         |
#   | Amanda D. Newland   | 319-243-5613         |
#   | Brooke P. Askew     | 307-687-2982         |
contacts = {
    "William A.Lathan": "405 - 709 - 1865",
    "John K. Miller": "402 - 247 - 8568",
    "Hortensia E.Foster": "606 - 481 - 6467",
    "Amanda D.Newland": "319 - 243 - 5613",
    "Brooke P.Askew": "307 - 687 - 2982"
}


#
# - Create an application which solves the following problems.
#   - What is John K. Miller's phone number?
def get_number(name):
    return contacts[name]


print(get_number("John K. Miller"))


#   - Whose phone number is 307-687-2982?
def get_name(number):
    for key, value in contacts.items():
        if value == number:
            return key


print(get_name("307 - 687 - 2982"))


#   - Do we know Chris E. Myers' phone number?
def do_we_know(name):
    return name in contacts.keys()


print(do_we_know("Chris E. Myer"))
