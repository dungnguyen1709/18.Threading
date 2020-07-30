package li_thuyet;

public class RunableC0520K1 implements Runnable {
    @Override
    public void run() {
       for (int i = 100;i < 200; i++ ) {
           System.out.println("Runable" + i);
       }
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
