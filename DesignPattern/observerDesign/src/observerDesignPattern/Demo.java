package observerDesignPattern;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Demo {
    public static void main(String ag[]) throws Exception
    {
        YoutubeChannel channel=new YoutubeChannel();

        Subscriber aman=new Subscriber("Aman");
        Subscriber ashish=new Subscriber("Ashish");
        channel.subscribed(aman);
        channel.subscribed(ashish);

        channel.videoUploaded("Learn Design pattern");
        channel.videoUploaded("Angular course");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        while(true)
        {
            System.out.println("Enter the 1 to add videos");
            System.out.println("Enter the 2 to add subscribers");
            System.out.println("Enter the 3 to remove subscribers");
            System.out.println("Enter 4 for exit");


            int value;
            value = Integer.parseInt(br.readLine());

            if(value==1)
            {
                System.out.println("Enter the video title!!");
                channel.videoUploaded(br.readLine());
            }
            else if(value==2)
            {
                System.out.println("Add new subscriber");
                Subscriber user1=new Subscriber(br.readLine());
                channel.subscribed(user1);
            }
            else  if(value==3)
            {
                System.out.println("Remove subscriber");
                ArrayList<Observer> list1=channel.getSubscribers();
                String name= br.readLine();
                for (Observer obj:list1) {
                    if(obj.getName().equals(name)) {
                        System.out.println(obj);
                        channel.unSubscribed(obj);
                    }
                }


            } else if (value==4) {
                break;
            }
            else
            {
                System.out.println("Invalid input ^^ !! Please try again!");
            }

        }

    }
}
