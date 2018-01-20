package main.Java.Button;

import main.Java.Clock.Clock;

public class SwitchButton implements PressableButton{
    private boolean isDown;

    @Override
    public void PressButton() {
        if(!isDown){
            isDown=true;
        }
    }

    public void ActivateOpposingClock(Clock opposingClock, Clock ownClock){
        opposingClock.run();
        ownClock.stop();
    }
}
