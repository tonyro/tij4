package net.tonyrovba.tij.innerclasses.Ex11;

/**
 * Created by Anton on 21.11.2014.
 */
public class MainEx11 {
    public static void main(String[] args) {

        Store store = new Store();

        Reachable storeLocation = store.getStoreLocation();

        System.out.println(storeLocation.isReachable());

        //StoreLocation
    }
}
