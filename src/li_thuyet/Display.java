package li_thuyet;

public class Display {
    void display(int n) {
        synchronized (this) {
            for (int i = 1; i < 100; i++) {
                System.out.println(n * i);
            }
        }
    }
}
