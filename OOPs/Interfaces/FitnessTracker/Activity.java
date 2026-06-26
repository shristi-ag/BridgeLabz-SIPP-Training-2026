package FitnessTracker;

public class Activity
{
    private String activityName;
    private int steps;

    public Activity(String activityName, int steps)
    {
        this.activityName = activityName;
        this.steps = steps;
    }

    public String getActivityName()
    {
        return activityName;
    }

    public int getSteps()
    {
        return steps;
    }

    public void displayActivity()
    {
        System.out.println("Activity Name : " + activityName);
        System.out.println("Steps : " + steps);
    }
}