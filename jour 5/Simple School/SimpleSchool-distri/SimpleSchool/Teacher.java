import java.util.ArrayList;
/**

 */
public class Teacher extends Person
{
    private ArrayList<Lecture> givenLectures;
    // todo
    
    public Teacher(String name, String surname, int age){
        super(name, surname, age);
        givenLectures = new ArrayList<Lecture>();
    }
    
    public void giveLecture(Lecture lecture){
        boolean trouve = false;
        for (Lecture lectures : givenLectures) {
            if ( lectures == lecture){
                trouve = true; 
            }
        }
        if ( trouve == false) {
            givenLectures.add(lecture);
        }
        else {
            System.out.println("Vous etes deja inscrit a cette classe");
        }
    }
    
    public int getNumberOfGivenLectures(){
        return givenLectures.size();
    }
    
    public String listGivenLectures(){
        String lecturesList = "";
        for (Lecture lecture : givenLectures) {
            lecturesList += lecture.getName() + " : " + lecture.getTeacher().getSurname() +" "+ lecture.getTeacher().getName() + ", " +
            lecture.getTeacher().getAge() + " years old, " + lecture.getNumberOfEnrolledStudents() + " enrolled students\n";
        }
        return lecturesList;    }
}
