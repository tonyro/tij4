package net.tonyrovba.tij.innerclasses.Ex15;

/**
 * Created by Anton on 09.12.2014.
 */
public class MainEx15 {

    public static void main(String[] args) {
        CarRental cr = new CarRental();
        EconomCar chevy = cr.rentEconomCar(3);
        System.out.println(chevy.getTerm());
        System.out.println(chevy.getCarName());
    }
}
