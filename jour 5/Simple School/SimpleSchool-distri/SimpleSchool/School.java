import java.util.ArrayList;

/**
 * A simple school that allows the management of lectures and members, who are
 * teachers, students
 *      Teachers teach lectures.
 *      Lectures cannot be created without a referent teacher, 
 *          and are related to only one teacher
 *      Students attend lectures, so they can register on lectures
 *      
 *  In the school, we can
 *      - enroll teachers
 *      - add lectures
 *      - enroll students on lectures
 *      - list all members (students and teachers)
 *      - list all lectures (title and teacher)
 *
 * @author PG
 * @version 09-2021
 */
public class School
{
    private String schoolName;
    private ArrayList<Person> members;
    private ArrayList<Lecture> lectures;
    
    // other attributes

    public School(String schoolName){
        this.schoolName = schoolName;
        this.members = new ArrayList<Person>();
        this.lectures = new ArrayList<Lecture>();
    }
    
    public void enrollTeacher(Teacher teacher) {
    if (!members.contains(teacher)) {
        members.add(teacher);
    } else {
        System.out.println("Teacher is already enrolled in the school.");
    }
    }   
    // The teacher must have been enrolled in the school
    public void addLecture(Lecture lecture) {
    //Teacher lectureTeacher = lecture.getTeacher();
    if (members.contains(lecture.getTeacher()) &&
    (!lectures.contains(lecture))) {
        lecture.getTeacher().giveLecture(lecture); // Enregistrer la lecture dans l'enseignant.
        lectures.add(lecture); // Ajouter la lecture à la liste des lectures de l'école.
    }
    }

    // if the course name does not exist, do nothing
    // The students should not be registered twice in the membre list
    public void enrollOnLecture(String lectureName, Student student)
    {
        for (Lecture lec : lectures) {
            //if (lectures.contains(lectureName)
            if (lec.name == lectureName) {
                if (!members.contains(student)){
                    members.add(student);
                }
                lec.enrol(student);
                student.registerOnLecture(lec);
            }
        }

    }
    
    public int getNumberOfMembers(){
        return members.size();
    }
    
    public String listMembers(){
        String listMembers = "";
        for (Person member : members) {
            listMembers += member.getSurname() + " " + member.getName() + ", " + member.getAge() + " years old\n";
        }
        return listMembers;
    }

    public int getNumberOfLectures(){
         return lectures.size();
    }
    
    public String listLectures() {
    String lecturesList = "";

    for (Lecture lecture : lectures) {
        lecturesList += lecture.getName() + " : " +
                        lecture.getTeacher().getSurname() + " " +
                        lecture.getTeacher().getName() + ", " +
                        lecture.getTeacher().getAge() + " years old, " +
                        lecture.getNumberOfEnrolledStudents() + " enrolled students\n";
    }

    return lecturesList;
    }
    
    public String getSchoolName(){
        return this.schoolName;
    }

}
