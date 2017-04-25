package net.tonyrovba.tij.holdingobjects.Ex13;

/**
 * Created by tonyr on 2/4/14.
 */
public class WaterMistControls extends GreenhouseControls {
    private boolean waterMist = false;
    public class WaterMistOn extends Event {
        WaterMistOn(long timeDelay) {
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
        WaterMistOff(long timeDelay) {
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
