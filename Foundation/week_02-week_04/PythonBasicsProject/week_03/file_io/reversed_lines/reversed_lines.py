# Create a method that decrypts reversed-lines.txt
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
        i = len(line)-2
        new_line = ""
        while i >= 0:
            new_line += line[i]
            i -= 1
        new_line += "\n"
        decrypted_content.append(new_line)

    decrypted_file = open("decrypted.txt", 'w')
    decrypted_file.writelines(decrypted_content)
    decrypted_file.close()


decrypt("source.txt")
