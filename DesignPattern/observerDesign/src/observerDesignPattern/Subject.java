package observerDesignPattern;

public interface Subject {

    public void subscribed(Observer obj);
    public void unSubscribed(Observer obj);

    public void videoUploaded(String title);

}
