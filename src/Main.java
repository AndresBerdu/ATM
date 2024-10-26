import class_atm.ClassChildren_Check;
import class_atm.ClassFather_Abstract;

public class Main {
    public static void main(String[] args) {
        ClassFather_Abstract fatherAbstract = new ClassChildren_Check();
        fatherAbstract.setBalance(5000);
        fatherAbstract.menu();
    }
}