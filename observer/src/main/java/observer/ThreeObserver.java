package observer;

public class ThreeObserver implements Observer {
    private Subject subject;

    public ThreeObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName() + ", The state has changed to " + subject.getState());
    }
}
