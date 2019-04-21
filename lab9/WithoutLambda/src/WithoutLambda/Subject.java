public interface Subject {
    public void attach(ParentObserver observer);
    public void detach(ParentObserver observer);
    public void notify1(String name);
}