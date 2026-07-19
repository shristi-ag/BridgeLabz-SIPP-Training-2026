package ContentModeration;

public class Main
{
    public static void main(String[] args)
    {
        String[] posts =
                {
                        "Have a nice day everyone!",
                        "Buy Now and get Free Gift",
                        "You are stupid",
                        "Click Here to win cash",
                        "Java is awesome",
                        "I hate this game"
                };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        moderator.moderatePosts(posts);
    }
}
