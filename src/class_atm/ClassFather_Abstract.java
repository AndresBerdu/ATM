package class_atm;

import javax.swing.*;
import java.util.Scanner;

public abstract class ClassFather_Abstract {
    protected int transactions;
    protected int withdraw;
    protected int deposit;
    private static int balance;

    Scanner input = new Scanner(System.in);

    public void menu() {
        int flag = 0;
        int selection = 0;

        do {
            do {
                String option = JOptionPane.showInputDialog(
                        null,
                        "1.Check Balance\n" +
                                "2.Withdraw Cash\n" +
                                "3.Deposit Cash\n" +
                                "4.Exit");

                selection = Integer.parseInt(option);

                if(selection >= 1 & selection <= 4) {
                    flag = 1;
                } else {
                    JOptionPane.showInternalMessageDialog(
                            null,
                            "Operation not available, please try again"
                    );
                }
            } while(flag == 0);

            if(selection == 1) {
                ClassFather_Abstract fatherAbstract = new ClassChildren_Check();
                fatherAbstract.operations();
            } else if (selection == 2) {
                ClassFather_Abstract fatherAbstract = new ClassChildren_Withdraw();
                fatherAbstract.operations();
            } else if (selection == 3) {
                ClassFather_Abstract fatherAbstract = new ClassChildren_Deposit();
                fatherAbstract.operations();
            } else if (selection == 4) {
                JOptionPane.showInternalMessageDialog(
                        null,
                        "Take you, come back soon"
                );
                flag = 2;
            }
        } while(flag != 2);
    }

    //Method for request withdraw cash
    public void methodWithdraw() {
        String option = JOptionPane.showInputDialog(
                null,
                "How much cash do you want to withdraw?: "
        );
        withdraw = Integer.parseInt(option);
    }

    //Method for deposit cash
    public void metohdDeposit() {
        String option = JOptionPane.showInputDialog(
                null,
                "How much cash do you want to deposit?: "
        );
        deposit = Integer.parseInt(option);
    }

    //Method abstract for operations
    public abstract void operations();

    //Methods setters and getters
    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        ClassFather_Abstract.balance = balance;
    }
}
