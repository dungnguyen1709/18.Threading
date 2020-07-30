package li_thuyet;

public class MainThread {
    public static void main(String[] args) {
//        Thread thread1 = new Thread();
//        Thread thread2 = new Thread() {
//            @Override
//            public void run() {
//                System.out.println("test");
//            }
//        };
        ThreadC0520K1 thread3 = new ThreadC0520K1();
        RunableC0520K1 runable = new RunableC0520K1();
        Thread thread4 = new Thread(runable);

//        thread1.start();
//        thread2.start();
        thread3.start();
        thread4.start();

    }
}
