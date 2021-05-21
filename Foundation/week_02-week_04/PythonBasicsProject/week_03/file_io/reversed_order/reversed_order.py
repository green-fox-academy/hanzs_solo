# Create a method that decrypts reversed-order.txt
def decrypt(file_name):
    try:
        source_file = open(file_name, 'r')
        encrypted_content = source_file.readlines()
        source_file.close()
    except IOError:
        print("cannot read file")
        return

    decrypted_content = []

    i = len(encrypted_content) - 1
    while i >= 0:
        decrypted_content.append(encrypted_content[i])
        i -= 1
    decrypted_file = open("decrypted.txt", 'w')
    decrypted_file.writelines(decrypted_content)
    decrypted_file.close()


decrypt("source.txt")
