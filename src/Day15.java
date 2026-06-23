public class Day15 {
    static void main() throws InterruptedException {
        Runnable chefTask = () -> {
            String[] items = {"chicken popcorn", "Fried rice", "Juice"};
            for(int i=0;i<items.length; i++){
                System.out.println("cooking Item:" + items[i]);
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread chefThread = new Thread(chefTask, "chef-Thread");
        chefThread.start();
        chefThread.join();
    }
}