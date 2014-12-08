package net.tonyrovba.tij.innerclasses.Ex12;

/**
 * Created by Anton on 10.09.2014.
 */
public class Bank {
    private String client = "Joe Doe";

    public String getClientName() {
        return this.client;
    }

    private void changeClientName(String clientName) {
        this.client = clientName;
    }

    public FrontOffice getFrontOffice() {
        return new FrontOffice() {
            void changeClientName(String clientName) {
                Bank.this.changeClientName(clientName);
            }
        };
    }
}
