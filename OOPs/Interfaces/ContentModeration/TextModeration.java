package ContentModeration;

public interface TextModeration
{
    // Abstract Method
    void checkOffensiveContent(String post);

    // Default Method
    default void displayModerationPolicy()
    {
        System.out.println("Policy : Offensive language is not allowed.");
    }

    // Static Method
    static boolean containsRestrictedWords(String post)
    {
        String text = post.toLowerCase();

        return text.contains("hate") ||
                text.contains("abuse") ||
                text.contains("stupid");
    }
}