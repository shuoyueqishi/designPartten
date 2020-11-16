package chainOfResponsibility;

public abstract class Support {
    private String name;
    private Support next;
    public Support(String name) {
        this.name=name;
    }
    public Support setNext(Support next) {
        this.next=next;
        return next;
    }
    @Override
    public String toString() {
        return "["+name+"]";
    }
    public abstract boolean resolve(Trouble trouble);
    protected void done(Trouble trouble) {
        System.out.println(trouble+" is resolved by "+this+".");
    }
    protected void fail(Trouble trouble) {
        System.out.println(trouble+" can't be resolved by "+this+".");
    }
    public final void support(Trouble trouble) {
        if(resolve(trouble)) {
            done(trouble);
        } else if (next!=null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }
}
