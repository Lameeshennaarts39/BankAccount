import java.util.*;

public class BankAccount {
    public static void main(String[] args) {

        String firstName = "input Name";
        String lastName = "input last name";
        String dateOfBirth = "Day Month Year";

        int accountNumber = 01111;
        int balance = 07;
        int deposit = 5;

        List bankBalance = new ArrayList();
        bankBalance.add("Original Amount");
        bankBalance.add("Withdrawn Value of money");
        bankBalance.add("New Amount");
        bankBalance.add("Withdrawn second money");
        bankBalance.remove(3);

        System.out.println(bankBalance.toString());

    }

}
