
/**

 */
//abstract means that we do not have person but only students and 
//teacher but in common sens we have person before these rules
public abstract class Person
{
    String name, surname;
    int age;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String toString(){
        return surname + " " + name + ", " + age + " years old";
    }

}