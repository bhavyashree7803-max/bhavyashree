public class Day14Factory {
    interface Notification{
        void send(String to, String message);
    }
    class CreditNotification implements Notification{
        @Override
        public void send(String to, String message){
            System.out.println("Amount Credited 800: "+message+", to"+to);
        }

    }
    class DebitNotification implements Notification{
        @Override
        public void send(String to, String message){
            System.out.println("Amount Debited 800: "+message+", to"+to);
        }
    }
    static Notification getNotification(Day14Factory factory, String type){
        return switch (type){
            case"Credit"-> factory.new CreditNotification();
            case"Debit"-> factory.new DebitNotification();
            default -> throw new IllegalArgumentException("Invalid account type:"+ type);
        };
    }
    static void main(){
        Day14Factory factory = new Day14Factory();
        String type = "Credit";
        getNotification(factory,type).send(" 123467798","Amount 800 credited");
    }
}
