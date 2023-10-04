import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private int grade;

    Map<String,Student> studentMap = new HashMap<>();


    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", studentMap=" + studentMap +
                '}';
    }

    public static Map<String, Student> increaseGrades(Map<String, Student> studentMap) {
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            Student student = entry.getValue();
            int currentGrade = student.getGrade();
            int newGrade = (int) (currentGrade * 1.10);
            student.setGrade(newGrade);
        }
        return studentMap;
    }}

