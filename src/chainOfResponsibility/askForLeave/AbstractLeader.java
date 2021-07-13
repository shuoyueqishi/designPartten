package chainOfResponsibility.askForLeave;

public abstract class AbstractLeader {
    private AbstractLeader next;

    public AbstractLeader getNext() {
        return next;
    }

    public void setNext(AbstractLeader next) {
        this.next = next;
    }

    abstract void approve(int days);
}
