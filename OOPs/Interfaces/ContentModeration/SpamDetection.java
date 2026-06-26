package ContentModeration;

public interface SpamDetection
{
    // Abstract Method
    void checkSpam(String post);

    // Default Method
    default void displayModerationPolicy()
    {
        System.out.println("Policy : Spam content is not allowed.");
    }
}