package tao_thread_don_gian;

public class NumberGeneratorTest {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberGenerator2 numberGenerator2 = new NumberGenerator2();

        Thread thread = new Thread(numberGenerator);
        Thread thread1 = new Thread(numberGenerator2);

        thread.start();
        thread1.start();
    }
}
