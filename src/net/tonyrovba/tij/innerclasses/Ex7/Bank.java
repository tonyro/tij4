package net.tonyrovba.tij.innerclasses.Ex7;

/**
 * Created by Anton on 10.09.2014.
 */
public class Bank {
    private String client = "Joe Doe";

    public String getClientName() {
        return this.client;
    }

    private class FrontOffice {
        private String changeAndGetClientName(String clientName) {
            client = clientName;

            return client;
        }
    }

    public void changeClientName(String clientName) {
        new FrontOffice().changeAndGetClientName(clientName);
    }
}
