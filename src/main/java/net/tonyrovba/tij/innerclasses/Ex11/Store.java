package net.tonyrovba.tij.innerclasses.Ex11;

import java.util.ArrayList;

/**
 * Created by Anton on 21.11.2014.
 */
public class Store {
    private double latitude = 50.00003;
    private double longitude = -50.001004;

    private class StoreLocation implements Reachable {
        public boolean isReachable() {
            return true;
        }

        ArrayList<Double> getGeoLocation() {
            ArrayList<Double> coordinates = new ArrayList<Double>();
            coordinates.add(latitude);
            coordinates.add(longitude);

            return coordinates;
        }
    }

    public StoreLocation getStoreLocation() {
        return new StoreLocation();
    }
}
