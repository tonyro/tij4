package net.tonyrovba.tij.innerclasses.Ex24GreenHouse;

/**
 * Created by tonyr on 2/4/14.
 */
public class WaterMistController {

    public static void main(String[] args) {
        WaterMistControls wm = new WaterMistControls();

        wm.addEvent(wm.new WaterMistOn(500));
        wm.addEvent(wm. new WaterMistOff(500));

        wm.run();
    }
}
