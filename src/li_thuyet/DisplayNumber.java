package li_thuyet;

public class DisplayNumber extends Thread {
    Display displayObj;
    DisplayNumber(Display displayObj) {
        this.displayObj = displayObj;
    }

    @Override
    public void run() {
        displayObj.display(100);
    }
}
