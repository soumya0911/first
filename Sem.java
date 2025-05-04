class Course {
    String name;
    int marks;

    Course(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Course: " + name + ", Marks: " + marks);
    }
}

class Semester {
    int number;
    Course[] courses;

    Semester(int number, Course[] courses) {
        this.number = number;
        this.courses = courses;
    }

    void display() {
        System.out.println("Semester " + number + ":");
        for (Course course : courses) {
            course.display();
        }
    }
}

public class Sem {
    public static void main(String[] args) {
        Semester semester1 = new Semester(1, new Course[]{
            new Course("BCA", 85),
            new Course("BSE", 90),
            new Course("BBA", 88)
        });

        semester1.display();
    }
}