package behavioral1;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscriber;

public class NewsReader implements Subscriber<News> {

    private String keepNewsReader;

    public NewsReader(String string){
        keepNewsReader = string;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }

    @Override
    public void onNext(News item) {
        System.out.println(item.getContent());
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
    // You need to implement this class
}
