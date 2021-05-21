# - `Student`
#   - `learn()` -> prints: `the student is actually learning`
#   - `question(teacher)` -> calls the teacher's giveAnswer() method
class Student():
    def learn(self):
        print("the student actually learning..")

    def question(self, teacher):
        teacher.give_answer()
