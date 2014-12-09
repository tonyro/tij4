package net.tonyrovba.tij.innerclasses.Ex15;

/**
 * Created by Anton on 09.12.2014.
 */
public class CarRental {

    public EconomCar rentEconomCar(final int days) {
        return new EconomCar(days) {
            public String getCarName() {
                return "Chevrolet Spark";
            }
        };
    }
}
