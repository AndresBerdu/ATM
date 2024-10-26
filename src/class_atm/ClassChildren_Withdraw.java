package class_atm;

import javax.swing.*;

public class ClassChildren_Withdraw extends ClassFather_Abstract{

    @Override
    public void operations() {
        methodWithdraw();

        if(withdraw <= getBalance()) {
            transactions = getBalance();
            setBalance(transactions - withdraw);

            JOptionPane.showMessageDialog(
                    null,
                    "You withdraw: " + withdraw + "$\n" +
                            "Your current balance is: " + getBalance() + "$"
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Insufficient balance"
            );
        }
    }
}
