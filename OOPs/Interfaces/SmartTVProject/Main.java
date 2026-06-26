package SmartTVProject;

public class Main
{
    public static void main(String[] args)
    {
        String[] movies =
                {
                        "Avengers",
                        "Interstellar",
                        "3 Idiots",
                        "The Batman"
                };

        String[] games =
                {
                        "Minecraft",
                        "FIFA 25",
                        "GTA V",
                        "PUBG"
                };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        tv.displayMovies(movies);

        tv.displayGames(games);

        System.out.println();

        tv.streamMovie(movies[0]);

        tv.playGame(games[2]);
    }
}