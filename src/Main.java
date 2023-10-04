
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {

        Map<String, Student> studentMap = new HashMap<>();

        Student Huda = new Student("huda", 70);
        Student Arwa = new Student("arwa", 80);
        Student Asma = new Student("asma", 90);
        Student Rawan = new Student("rawan", 95);


        studentMap.put("huda", Huda);
        studentMap.put("arwa", Arwa);
        studentMap.put("asma", Asma);
        studentMap.put("rawam", Rawan);
        System.out.println(studentMap.get("huda").getGrade());;



        System.out.println(studentMap);



        studentMap.forEach((key,value) -> {
            System.out.println(key + "=" + value + " ");
        });

    }
}
