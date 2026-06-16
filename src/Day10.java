import java.util.ArrayList;
public class StudentProgram {
    public static void main() {
        ArrayList<String> students = new ArrayList<>();
        students.add("Tharun");
        students.add("Bhavya");
        students.add("Varnika");
        students.add("Ram");
        students.add("Anu");
        System.out.println("Student List:");
        for (String s : students) {
            System.out.println(s);
        }
        students.remove("Ram");
        System.out.println("\nAfter Removing Ram:");
        for (String s : students) {
            System.out.println(s);
        }
    }
}
