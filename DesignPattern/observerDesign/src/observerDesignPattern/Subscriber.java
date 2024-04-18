package observerDesignPattern;

public class Subscriber implements Observer{

    private String  name;

    @Override
    public String getName()
    {
        return name;
    }

    public Subscriber(String name)
    {
        this.name=name;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                '}';
    }

    public Subscriber()
    {

    }
    @Override
    public void notifyVideo(String title) {
        System.out.println(name + ": New Video uplodaed: " + title);
    }
}
