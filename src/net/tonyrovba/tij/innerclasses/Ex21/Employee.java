package net.tonyrovba.tij.innerclasses.Ex21;

/**
 * Created by Anton on 11.01.2015.
 */
public interface Employee {
    String showPass();

    public static class PassValidator {
        private static Employee employee;

        public PassValidator(Employee employee) {
            this.employee = employee;
        }

        public static void validatePass() {
            System.out.println(employee.showPass());
        }
    }
}
