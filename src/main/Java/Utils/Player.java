package main.Java.Utils;

import main.Java.Button.ResetButton;
import main.Java.Button.SwitchButton;
import main.Java.Clock.Clock;

public class Player {
    SwitchButton switchButton;
    Clock clock;
    ResetButton resetButton;

    public Player(SwitchButton switchButton,Clock clock,ResetButton resetButton){
        this.switchButton=switchButton;
        this.clock=clock;
        this.resetButton=resetButton;
    }
    public Player(){
        this.switchButton=new SwitchButton();
        this.clock=new Clock();
        this.resetButton=new ResetButton();
    }

}
