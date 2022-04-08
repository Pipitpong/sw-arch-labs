package behavioral1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;

public class NewsPublisher implements Publisher<News> {
    private Set<Subscriber<News>> subscribers;

    public NewsPublisher(){
        subscribers = new LinkedHashSet<Subscriber<News>>();
    }

    public void publish(News news){
        for (Subscriber<News> subscriber: subscribers
             ) {
            subscriber.onNext(news);
        }
    }

    @Override
    public void subscribe(Subscriber<? super News> subscriber) {
        subscribers.add((Subscriber<News>) subscriber);
    }

}
