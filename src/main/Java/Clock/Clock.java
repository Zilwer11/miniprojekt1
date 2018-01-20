package main.Java.Clock;

public class Clock implements Runnable,Resettable{

    private HoursHand hoursHand;
    private MinutesHand minutesHand;
    private SecondsHand secondsHand;


    @Override
    public void run() {



    }

    @Override
    public void stop() {

    }

    @Override
    public void reset() {
        hoursHand.reset();
        minutesHand.reset();
        secondsHand.reset();

    }
}
