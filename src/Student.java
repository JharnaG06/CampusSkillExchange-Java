import java.util.ArrayList;

public class Student {

    // Basic student information
    String studentId;
    String name;
    String course;
    int year;

    // Skills the student can teach
    ArrayList<Skill> offeredSkills = new ArrayList<>();

    // Skills the student wants to learn
    ArrayList<Skill> wantedSkills = new ArrayList<>();

}