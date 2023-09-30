abstract class Animal {
    public abstract String eat();
    public abstract String sleep();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
