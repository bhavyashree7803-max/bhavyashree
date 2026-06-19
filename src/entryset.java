import java.util.HashMap;
import java.util.Map;
public class entryset{
    public static void main(){
        Map<String,Object> person = new HashMap<>();
        person.put("Tharun"89);
        person.put("Bhavya"78);
        person.put("Varnika"69);
        person.put("Thiya"90);
        person.entrySet().forEach( Entry<String,Object>entry ->{
            System.out.println(entry.getKey() +":"+ entry.getValue());
        }

    }
}