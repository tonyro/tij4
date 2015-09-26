package net.tonyrovba.tij.innerclasses.Ex7;

/**
 * Created by Anton on 10.09.2014.
 */
public class Bank {
    private String client = "Joe Doe";

    public String getClientName() {
        return this.client;
    }

    class FrontOffice {
        void changeClientName(String clientName) {
            Bank.this.changeClientName(clientName);
        }
    }

    private void changeClientName(String clientName) {
        this.client = clientName;
    }

    public FrontOffice getFrontOffice() {
        return new FrontOffice();
    }
}
