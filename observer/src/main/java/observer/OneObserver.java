package observer;

public class OneObserver implements Observer {

    private Subject subject;

    public OneObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName() + ", The state has changed to " + subject.getState());
    }
}
