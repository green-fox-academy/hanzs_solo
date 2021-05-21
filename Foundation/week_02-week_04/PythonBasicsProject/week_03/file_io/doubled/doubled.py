# Create a method that decrypts the duplicated-chars.txt
# Decryption is the process reversing an encryption, i.e. the process
# which converts encrypted data into its original form.

def decrypt(file_name):
    try:
        source_file = open(file_name, 'r')
        encrypted_content = source_file.readlines()
        source_file.close()
    except IOError:
        print("cannot read file")
        return

    decrypted_content = []
    for line in encrypted_content:
        i = 0
        new_line = ""
        while i < len(line):
            new_line += line[i]
            i += 2
        decrypted_content.append(new_line)

    decrypted_file = open("decrypted.txt", 'w')
    decrypted_file.writelines(decrypted_content)
    decrypted_file.close()


decrypt("source.txt")
