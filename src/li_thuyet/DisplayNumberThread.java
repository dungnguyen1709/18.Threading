package li_thuyet;

public class DisplayNumberThread extends Thread {
    Display displayObj;
    DisplayNumberThread(Display displayObj) {
        this.displayObj = displayObj;
    }

    @Override
    public void run() {
        displayObj.display(10);
    }
}
