package class_atm;

import javax.swing.*;

public class ClassChildren_Check extends ClassFather_Abstract{

    @Override
    public void operations() {
        JOptionPane.showMessageDialog(
                null,
                "Your current balance is: " + getBalance() + "$"
        );
    }
}
