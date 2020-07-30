package hien_thi_so_chan_le;

import javax.swing.plaf.TableHeaderUI;
import java.io.EOFException;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//        Thread oddThread = new OddThread();
//        Thread evenThread = new EvenThread();
//
//        try {
//            oddThread.start();
//            oddThread.join();
//            evenThread.start();
//        } catch (InterruptedException e) {
//            System.err.println(e.getMessage());
//        }

        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        Thread thread1 = new Thread(oddThread);
        Thread thread2 = new Thread(evenThread);

        thread1.start();
        thread1.join();
        thread2.start();
    }
}
