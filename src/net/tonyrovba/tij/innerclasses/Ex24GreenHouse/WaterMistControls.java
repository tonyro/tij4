package net.tonyrovba.tij.innerclasses.Ex24GreenHouse;

/**
 * Created by tonyr on 2/4/14.
 */
public class WaterMistControls extends GreenhouseControls {
    private boolean waterMist = false;
    public class WaterMistOn extends Event {
        public WaterMistOn(long timeDelay) {
            super(timeDelay);
        }

        public void action() {
            waterMist =true;
        }

        public String toString() {
            return "Water Mist generators are on";
        }
    }

    public class WaterMistOff extends Event {
        public WaterMistOff(long timeDelay) {
            super(timeDelay);
        }

        public void action() {
            waterMist =false;
        }

        public String toString() {
            return "Water Mist generators are off";
        }
    }
}
