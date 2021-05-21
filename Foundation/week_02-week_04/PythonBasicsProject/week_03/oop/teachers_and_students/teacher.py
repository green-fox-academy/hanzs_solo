# - `Teacher`
#   - `teach(student)` -> calls the student's learn() method
#   - `giveAnswer()` -> prints: `the teacher is answering a question`
class Teacher():
    def teach(self, student):
        student.learn()

    def give_answer(self):
        print("the teacher answering a question..")
