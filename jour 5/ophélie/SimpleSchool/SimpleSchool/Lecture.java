import java.util.ArrayList;

/**
 * A lecture is defined by its name and its teacher
 * Student can enroll on lectures
 *
 * @author PG
 * @version 09-2021
 */
public class Lecture
{
    String name; // name of the course
    Teacher teacher; // Referent teacher
    private ArrayList<Student> enrolledStudents;

    
    public Lecture(String name, Teacher teacher)
    {
        this.name = name;
        this.teacher = teacher;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }
    
    public Teacher getTeacher(){
        return this.teacher;
    }
    
    public int getNumberOfEnrolledStudents(){
        return enrolledStudents.size();
    }

    public void enrol(Student student){
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }
    
    public String listStudents() {
        String studentsList = "";
        for (Student student : enrolledStudents) {
            studentsList += student.getSurname() + " " 
            + student.getName() +", " + student.getAge() 
            +" years old\n";
        }
        return studentsList;
    }  
    
    public String toString(){
        return name + " : " + teacher + ", " 
            + this.getNumberOfEnrolledStudents() + " enrolled students";
    }
}