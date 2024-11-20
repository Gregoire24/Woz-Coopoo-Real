import java.util.ArrayList;
/**
 * The Student class is a Person. Specifically, a student can
 *  - register on a lecture
 *  - return the list (textual format) of attended lectures
 *
 * @author PG
 * @version 09-2021
 */
public class Student extends Person
{
    private ArrayList<Lecture> registeredLectures;
    
    public Student(String name, String surname, int age){
        super(name, surname, age);
        registeredLectures = new ArrayList<>();
    }
    
    public void registerOnLecture(Lecture theLecture){
        if (!registeredLectures.contains(theLecture)) {
            registeredLectures.add(theLecture);
        }
    }

    public int getNumberOfRegisteredLectures(){
        return registeredLectures.size();
    }
    

    public String listRegisteredLectures() {
    String thelect = "";
    for (Lecture lec : registeredLectures) {
        int numberOfStudents = lec.getNumberOfEnrolledStudents();
        thelect += lec.getName() + " : " + lec.getTeacher() + ", " + numberOfStudents + " enrolled students\n";
    }
    return thelect;
}
}
