# # Sharpie
#
# - Create a `Sharpie` class
class Sharpie():
    #   - We should know the followings about each sharpie:
    #     - `color` (which should be a string),
    #     - `width` (which will be a floating point number) and the
    #     - `ink_amount` (another floating point number)
    #   - We need to specify the `color` and the `width` at creation
    #   - Every sharpie is created with a default `ink_amount` value: `100`
    def __init__(self, color, width):
        self.color = color
        self.width = width
        self.ink_amount = float(100)

    @property
    def color(self):
        return self._color

    @color.setter
    def color(self, color):
        if not isinstance(color, str):
            raise TypeError("You are an idiot.")

        self._color = color

    @property
    def width(self):
        return self._width

    @width.setter
    def width(self, width):
        if not isinstance(width, int):
            raise TypeError("omg dude..")
        self._width = width

    #   - We can `use()` the sharpie objects: using it decreases
    #     `ink_amount` by `10`
    def use(self):
        self.ink_amount -= 10


# black_one = Sharpie("black", 100)
# print(black_one.color)
# print(black_one.width)
# print(black_one.ink_amount)
# black_one.use()
# print(black_one.ink_amount)
#
# bad_one = Sharpie(1, 100)
# print(bad_one.color)
# print(bad_one.width)
# print(bad_one.ink_amount)

