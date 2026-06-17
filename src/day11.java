import java.util.LinkedList;
public class day11{
    public static void main(String[] args) {
        LinkedList<String> set = new LinkedList<String>();
        set.add("student1");
        set.add("student2");
        set.add("student1");
        set.add("student2");
        set.add("student1");
        set.add("student2");
        set.add("student1");
        for (String s : set)
            System.out.println(s);
    }
}