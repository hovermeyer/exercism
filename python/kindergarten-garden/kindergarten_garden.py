class Garden:
    default_students = ['Alice', 'Bob', 'Charlie', 'David',
                        'Eve', 'Fred', 'Ginny', 'Harriet',
                        'Ileana', 'Joseph', 'Kincaid', 'Larry']

    def __init__(self, diagram, students= default_students):
        self.diagram = diagram.split()
        self.students = sorted(students)


    def plants(self, student):
        plants = {'C':'Clover', 'G':'Grass','R':'Radishes', 'V':'Violets'}
        student_index = (self.students.index(student))
        student_plants = []
        student_plants.append(plants[self.diagram[0][student_index*2]])
        student_plants.append(plants[self.diagram[0][student_index*2+1]])
        student_plants.append(plants[self.diagram[1][student_index*2]])
        student_plants.append(plants[self.diagram[1][student_index*2+1]])
        return student_plants
