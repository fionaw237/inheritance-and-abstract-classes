public class Student extends Programmer{

    public Student(String name, String cohort) {
        super(name, cohort);
    }

    public String talk(String language){
        return "I love learning " + language;
    }

}
