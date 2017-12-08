package thinkinginjava.chapter08.exercise16;

public class State {

    private Alert alert = new LowAlert();

    void showStatus() {
        alert.status();
    }

    void setLowAlert() {
        alert = new LowAlert();
    }

    void setElevatedAlert() {
        alert = new ElevatedAlert();
    }

    void setSevereAlert() {
        alert = new SevereAlert();
    }
}
