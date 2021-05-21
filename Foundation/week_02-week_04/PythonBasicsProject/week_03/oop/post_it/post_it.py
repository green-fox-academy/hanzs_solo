# # Post-it

# - Create a `PostIt` class that has
#   - a `background_color`
#   - a `text` on it
#   - a `text_color`
# - Create a few example post-it objects:
#   - an orange with blue text: "Idea 1"
#   - a pink with black text: "Awesome"
#   - a yellow with green text: "Superb!"

class PostIt():
    def __init__(self, background_color, text, text_color):
        self.background_color = background_color
        self.text = text
        self.text_color = text_color


post_it_1 = PostIt("orange", "Idea 1", "blue")
post_it_2 = PostIt("orange", "Awesome", "black")
post_it_3 = PostIt("yellow", "Superb", "green")
