package class_atm;

import javax.swing.*;

public class ClassChildren_Deposit extends ClassFather_Abstract {

    @Override
    public void operations() {
        metohdDeposit();

        transactions = getBalance();
        setBalance(transactions + deposit);

        JOptionPane.showMessageDialog(
                null,
                "You deposit: " + deposit + "$\n" +
                        "Your current balance is: " + getBalance() + "$"
        );
    }
}
