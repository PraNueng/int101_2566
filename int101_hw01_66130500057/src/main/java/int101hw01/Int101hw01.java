package int101hw01;

import work03.MyUtil;
import work04.BankAccount;
import work04.Person;

public class Int101hw01 {

    public static void main(String[] args) {
        work01Question(true, false, true, false, true, false);
        work01Answer(true, false, true, false, true, false);
        work02Question(1, 2, 3, 4, 5, 6);
        work02Answer(1, 2, 3, 4, 5, 6);
        work03UseofUtilityClass();
        work04UseofObjectClass();
    }
    static void work01Question(boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, boolean b6) {
        boolean b = ((b1 ^ (b2 | b3)) && b4) || (b5 & b6);
        System.out.println("Work 01 : Question : b = " + b);
    }
    static void work01Answer(boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, boolean b6) {
        boolean b = b1 ^ (b2 | b3) && b4 || b5& b6;
        System.out.println("Work 01 : Answer : b = " + b);      
    }
    static void work02Question(int i1, int i2, int i3, int i4, int i5, int i6) {
        boolean b = ((i1 << i2) < i3) != (i3 > ((i4 ^ i5) | i6));
        System.out.println("Work 02 Question : b = " + b);
    }
    static void work02Answer(int i1, int i2, int i3, int i4, int i5, int i6) {
        boolean b = i1 << i2 < i3 != i3 > (i4 ^ i5 | i6);
        System.out.println("Work 02 : Answer : b = " + b);
    }
    static void work03UseofUtilityClass() {
        double weight = 70;
        double height = 1.65;
        int i1 = 10;
        int i2 = 21;
        int i3 = 30;
        
        System.out.println("");
        System.out.println("Calculate BMI : ");
        System.out.println("Weight = " + weight);
        System.out.println("Height = " + height);
        System.out.println("BMI : " + MyUtil.calculateBMI(weight, height));
        
        System.out.println("");
        System.out.println("Average : ");
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("The Result : " + MyUtil.average(i1, i2, i3));
    }
    static void work04UseofObjectClass() {
        Person person1 = new Person(65);
        Person person2 = new Person(77);
        
        BankAccount account1 = new BankAccount(66065, person1);
        BankAccount account2 = new BankAccount(65077, person2);
        account1.deposit(1000.2);
        account2.deposit(2000.3);
    
        account1.withdraw(100);
        account2.withdraw(200);
    
        account2.transfer(110.8, account1);
    
        System.out.println("Account Owner : " + account1.getOwner());
        System.out.println("AcciuntNumber : " + account1);
        System.out.println("Account Balance : " + account1.getBalance());
        System.out.println("");
    
        System.out.println("Account Owner : " + account2.getOwner());
        System.out.println("Acount Number : " + account2);
        System.out.println("Account Balance : " + account2.getBalance());
    }
}
