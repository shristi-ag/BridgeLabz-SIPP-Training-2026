package SmartTVProject;

public class SmartTV implements StreamingService, GamingService
{
    @Override
    public void streamMovie(String movie)
    {
        System.out.println("Now Streaming : " + movie);
    }

    @Override
    public void playGame(String game)
    {
        System.out.println("Now Playing : " + game);
    }

    // Resolving Default Method Conflict
    @Override
    public void showSubscriptionDetails()
    {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public void displayMovies(String[] movies)
    {
        System.out.println("\nAvailable Movies");
        for (String movie : movies)
        {
            System.out.println(movie);
        }
    }

    public void displayGames(String[] games)
    {
        System.out.println("\nAvailable Games");
        for (String game : games)
        {
            System.out.println(game);
        }
    }
}