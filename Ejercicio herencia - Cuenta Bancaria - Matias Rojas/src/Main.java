public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount1 = new SavingsAccount(15000,10);


        savingsAccount1.consign(5000);
        savingsAccount1.printAccountDetails();

        savingsAccount1.calculateInterest();
        savingsAccount1.printAccountDetails();

        savingsAccount1.withdraw(2000);
        savingsAccount1.withdraw(1200);
        savingsAccount1.withdraw(100);
        savingsAccount1.withdraw(5000);
        savingsAccount1.printAccountDetails();

        savingsAccount1.withdraw(26000);
        savingsAccount1.printAccountDetails();

        savingsAccount1.withdraw(1);
        savingsAccount1.consign(1);

    }
}
