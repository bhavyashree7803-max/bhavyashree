import java.util.LinkedList;
public class studentlist{

    static void process(LinkedList<String> list) {
        System.out.println("Removed : " + list.removeFirst());
    }

    public static void main() {

        LinkedList<String> list = new LinkedList<>();
        list.add("101 - Tharun - 85");
        list.add("102 - Bhavya - 78");
        list.add("103 - Ayappan - 90");
        list.add("104 - Thiya - 88");
        list.add("105 - Vennila - 75");

        System.out.println("Student List:");
        System.out.println(list);
        list.add("106 - Varnika - 92");
        System.out.println("\nAfter Adding:");
        System.out.println(list);
        process(list);

        System.out.println("\nAfter Removing:");
        System.out.println(list);
        list.set(2, "104 - Thiya - 95");

        System.out.println("\nAfter Updating:");
        System.out.println(list);
        }
}