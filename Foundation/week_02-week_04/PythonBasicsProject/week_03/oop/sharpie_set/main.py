from sharpie_set import SharpieSet
from week_03.oop.sharpie.sharpie import Sharpie


s_list1 = []
s_list1.append(Sharpie("blue", 20))
s_list1.append(Sharpie("red", 40))
s_list1.append(Sharpie("yellow", 100))


sharpie_set_1 = SharpieSet(s_list1)
print(len(sharpie_set_1.sharpie_list))
for i in range(11):
    sharpie_set_1.sharpie_list[1].use()

print(sharpie_set_1.count_usable())
sharpie_set_1.remove_trash()

print(len(sharpie_set_1.sharpie_list))
