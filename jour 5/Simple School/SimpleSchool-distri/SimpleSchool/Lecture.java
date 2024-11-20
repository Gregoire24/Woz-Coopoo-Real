import java.util.ArrayList;
import java.util.List;
/**
 */
public class Lecture
{
    String name; // name of the course
    Teacher teacher; // Referent teacher
    List<Student> enrol;// list of enrolled students
    // todo
    
    public Lecture(String name, Teacher teacher)
    {
        this.name = name;
        this.teacher = teacher;
        this.enrol = new ArrayList<>();// todo
    }

    public String getName(){
        return this.name;
    }
    
    public Teacher getTeacher(){
        return this.teacher;
    }
    
    public int getNumberOfEnrolledStudents(){
        return enrol.size(); // todo: replace code
    }

    public void enrol(Student student){
        if (!enrol.contains(student)) { // check if the student is not already enrolled
            enrol.add(student); // add student to the list
        }// todo
    }
    
    public String listStudents(){
         String result = "";
        for (Student student : enrol) {
            result += student.toString() + "\n"; // append each student's details
        }
        return result; // remove any trailing newline
    }
    
    public String toString(){
        return name + " : " + teacher + ", " 
            + this.getNumberOfEnrolledStudents() + " enrolled students";
    }


}

