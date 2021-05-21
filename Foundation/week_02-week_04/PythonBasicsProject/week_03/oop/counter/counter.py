# # Counter
#
# - Create `Counter` class
class Counter():

    #   - which has a `counter` (integer) field
    #   - at creation it should have a default value `0` or can be specified
    #   by a parameter
    def __init__(self, counter=0):
        self.counter = counter
        self.init_value = counter

    #   - we can add another whole number to this counter: `add(number)`
    #   - we can just increase the counter's value by one: `add()` (no parameters)
    def add(self, number=1):
        self.counter += number

    #   - we can `get()` the current counter value
    def get(self):
        return self.counter

    #   - and we can `reset()` the counter to the initial value
    def reset(self):
        self.counter = self.init_value
# - Check if everything is working fine with the proper test
#   - Download `test_counter.py` and place it next to your solution
#   - Run the test file as a usual python program
