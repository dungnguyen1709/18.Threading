package li_thuyet;

public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        DisplayNumberThread displayNumberThread = new DisplayNumberThread(display);
        DisplayNumber displayNumber = new DisplayNumber(display);

        displayNumber.start();
        displayNumberThread.start();
    }
}
