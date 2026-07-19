package FitnessTracker;

public class Main
{
    public static void main(String[] args)
    {
        Activity activity = new Activity("Morning Walk", 6000);

        FitnessDevice device = new FitnessDevice(activity);

        device.logActivity();

        device.generateReport();

        device.sendAlert();

        device.resetData();
    }
}