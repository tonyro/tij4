package net.tonyrovba.tij.innerclasses.Ex21;

/**
 * Created by tonnur on 14.01.15.
 */
public class MainEx21 {

    public static void main(String[] args) {
        Accountant john = new Accountant();

        Employee.PassValidator pv = new Employee.PassValidator(john);

        pv.validatePass();
    }
}
