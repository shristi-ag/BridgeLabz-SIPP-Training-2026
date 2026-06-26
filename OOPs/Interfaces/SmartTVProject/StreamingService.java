package SmartTVProject;

public interface StreamingService
{
    void streamMovie(String movie);

    default void showSubscriptionDetails()
    {
        System.out.println("Streaming Subscription : Netflix Premium");
    }
}