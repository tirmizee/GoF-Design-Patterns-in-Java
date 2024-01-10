package observer;

public class TwoObserver implements Observer {
    private Subject subject;

    public TwoObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName() + ", The state has changed to " + subject.getState());
    }
}
