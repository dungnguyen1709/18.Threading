package tao_thread_don_gian;

public class NumberGenerator2 implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i <=20 ;i++) {
            System.out.println(i);
            System.out.println(hashCode());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
