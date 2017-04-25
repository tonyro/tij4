package net.tonyrovba.tij.holdingobjects.Ex13;

/**
 * Created by tonyr on 2/4/14.
 */

class GreenhouseControls extends Controller {
    private boolean light = false;
    public class LightOn extends Event {
        LightOn(long delayTime) { super(delayTime); }
        public void action() {
            // Put hardware control code here to
            // physically turn on the light.
            light = true;
        }
        public String toString() { return "Light is on"; }
    }

    public class LightOff extends Event {
        LightOff(long delayTime) { super(delayTime); }
        public void action() {
            // Put hardware control code here to
            // physically turn off the light.
            light = false;
        }
        public String toString() { return "Light is off"; }
    }

    private boolean water = false;
    public class WaterOn extends Event {
        WaterOn(long delayTime) { super(delayTime); }
        public void action() {
            // Put hardware control code here.
            water = true;
        }
        public String toString() {
            return "Greenhouse water is on";
        }
    }

    public class WaterOff extends Event {
        WaterOff(long delayTime) { super(delayTime); }
        public void action() {
            // Put hardware control code here.
            water = false;
        }
        public String toString() {
            return "Greenhouse water is off";
        }
    }

    private String thermostat = "Day";
    public class ThermostatNight extends Event {
        ThermostatNight(long delayTime) {
            super(delayTime);
        }
        public void action() {
            // Put hardware control code here.
            thermostat = "Night";
        }
        public String toString() {
            return "Thermostat on night setting";
        }
    }

    public class ThermostatDay extends Event {
        ThermostatDay(long delayTime) {
            super(delayTime);
        }
        public void action() {
            // Put hardware control code here.
            thermostat = "Day";
        }
        public String toString() {
            return "Thermostat on day setting";
        }
    }

    private boolean fans = false;
    public class FansOn extends Event {
        FansOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            fans = true;
        }
        public String toString() {
            return "Fans are on";
        }
    }

    public class FansOff extends Event {
        FansOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            fans = false;
        }
        public String toString() {
            return "Fans are off";
        }
    }

    // An example of an action() that inserts a
    // new one of itself into the event list:
    public class Bell extends Event {
        Bell(long delayTime) { super(delayTime); }
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString() { return "Bing!"; }
    }

    public class Restart extends Event {
        private Event[] eventList;
        Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for(Event e : eventList)
                addEvent(e);
        }
        public void action() {
            for(Event e : eventList) {
                e.start(); // Rerun each event
                addEvent(e);
            }
            start(); // Rerun this Event
            addEvent(this);
        }
        public String toString() {
            return "Restarting system";
        }
    }

    public static class Terminate extends Event {
        Terminate(long delayTime) { super(delayTime); }
        public void action() { System.exit(0); }
        public String toString() { return "Terminating"; }
    }
}
