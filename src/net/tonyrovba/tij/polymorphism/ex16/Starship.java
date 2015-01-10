package net.tonyrovba.tij.polymorphism.ex16;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 13.08.13
 * Time: 16:46
 * To change this template use File | Settings | File Templates.
 */

class AlertStatus {
    public void alert() {}
}

class Info extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("[ INFO ]");
    }
}

class Warning extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("[ WARNING ]");
    }
}

class Fatal extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("[ !!! FATAL !!! ]");
    }
}

class Alert {
    private AlertStatus alert = new Info();

    public void showAlert() {
        alert.alert();
    }

    public void changeAlert(String newAlert) {
        if(newAlert == "WARNING")
            alert = new Warning();
        else if(newAlert == "FATAL")
            alert = new Fatal();
        else if(newAlert == "INFO")
            alert = new Info();
    }
}

public class Starship {

    public static void main(String[] args) {
        Alert alertPane = new Alert();

        alertPane.showAlert();
        alertPane.changeAlert("WARNING");
        alertPane.showAlert();
        alertPane.changeAlert("FATAL");
        alertPane.showAlert();
        alertPane.changeAlert("INFO");
        alertPane.showAlert();
    }
}
