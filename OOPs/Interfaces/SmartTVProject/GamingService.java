package SmartTVProject;

public interface GamingService
{
    void playGame(String game);

    default void showSubscriptionDetails()
    {
        System.out.println("Gaming Subscription : Xbox Game Pass");
    }
}