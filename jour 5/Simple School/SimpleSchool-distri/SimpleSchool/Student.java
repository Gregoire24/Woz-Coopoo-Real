import java.util.ArrayList;

/**
 
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

    public String listRegisteredLectures(){
    String thelect = "";
    for (Lecture lec : registeredLectures) {
        int numberOfStudents = lec.getNumberOfEnrolledStudents();
        thelect += lec.getName() + " : " + lec.getTeacher() + ", " + numberOfStudents + " enrolled students\n";
    }
    return thelect;    
}
}
