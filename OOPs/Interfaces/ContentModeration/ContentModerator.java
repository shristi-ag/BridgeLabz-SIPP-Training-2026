package ContentModeration;

public class ContentModerator implements TextModeration, SpamDetection
{
    @Override
    public void checkOffensiveContent(String post)
    {
        if (TextModeration.containsRestrictedWords(post))
        {
            System.out.println("Offensive Post : " + post);
        }
    }

    @Override
    public void checkSpam(String post)
    {
        String text = post.toLowerCase();

        if (text.contains("buy now") ||
                text.contains("click here") ||
                text.contains("free"))
        {
            System.out.println("Spam Post : " + post);
        }
    }

    // Resolve Default Method Conflict
    @Override
    public void displayModerationPolicy()
    {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public void moderatePosts(String[] posts)
    {
        System.out.println("\nPost Analysis");

        for(String post : posts)
        {
            String text = post.toLowerCase();

            boolean offensive = TextModeration.containsRestrictedWords(post);

            boolean spam = text.contains("buy now") ||
                    text.contains("click here") ||
                    text.contains("free");

            if(spam)
            {
                System.out.println("Spam Post : " + post);
            }
            else if(offensive)
            {
                System.out.println("Offensive Post : " + post);
            }
            else
            {
                System.out.println("Valid Post : " + post);
            }
        }
    }
}