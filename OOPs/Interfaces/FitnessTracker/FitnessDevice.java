package FitnessTracker;

public class FitnessDevice implements Trackable, Reportable, Notifiable
{
    private Activity activity;

    public FitnessDevice(Activity activity)
    {
        this.activity = activity;
    }

    @Override
    public void logActivity()
    {
        System.out.println("\nLogging Activity...");
        activity.displayActivity();
    }

    @Override
    public void generateReport()
    {
        System.out.println("\nGenerating Fitness Report...");
        System.out.println("Total Steps : " + activity.getSteps());
    }

    @Override
    public void sendAlert()
    {
        System.out.println("\nAlert : Time for your next workout!");
    }
}