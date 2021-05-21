# - Create `SharpieSet` class
#   - it contains a list of Sharpie
#   - count_usable() -> sharpie is usable if it has ink in it
#   - remove_trash() -> removes all unusable sharpies

class SharpieSet():
    def __init__(self, sharpie_list=[]):
        self.sharpie_list = sharpie_list

    def count_usable(self):
        counter = 0
        for sharpie in self.sharpie_list:
            if sharpie.ink_amount > 0:
                counter += 1
        return counter

    def remove_trash(self):
        i = 0
        while i < len(self.sharpie_list):
            if self.sharpie_list[i].ink_amount < 0:
                self.sharpie_list.pop(i)
                i -= 1
            i += 1

