class Course{
    String course;
    int sem;
    float marks;

    Course(String course, int sem, float marks){
        this.course=course;
        this.sem=sem;
        this.marks=marks;
    }
    void displayCourse(){
        System.out.println("Course:"+course+" sem:"+sem+" Marks:"+marks);
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Course c = new Course("Java",4,40);
        Course c1 = new Course("Big Data",4,40);
        Course c2 = new Course("Devops",4,40);
        c.displayCourse();
        c1.displayCourse();
        c2.displayCourse();
    }
