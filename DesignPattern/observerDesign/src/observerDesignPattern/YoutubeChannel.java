package observerDesignPattern;

import java.util.ArrayList;

public class YoutubeChannel implements Subject{

    ArrayList<Observer> subscribers=new ArrayList();

    public ArrayList<Observer> getSubscribers()
    {
        return subscribers;
    }
    @Override
    public void subscribed(Observer obj) {
        this.subscribers.add(obj);
    }

    @Override
    public void unSubscribed(Observer obj) {
        this.subscribers.remove(obj);
    }

    @Override
    public void videoUploaded(String title) {

        for(Observer obj:subscribers)
        {
            obj.notifyVideo(title);
        }

    }


}
