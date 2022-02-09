public class scheduleDriver
{
    public static void main(String[] args)
    {
        Route trailexample = new Trail("SD", "LAX", "Death", 100);
        Schedule scheduleExample = new Schedule("9am", "10:30am");

        scheduleExample.addRoute(trailexample);

        System.out.println(scheduleExample.toString());

    }
}
