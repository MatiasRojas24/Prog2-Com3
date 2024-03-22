import java.lang.Math;
public class CurrentAccount extends Account{
    private float overdraft = 0;

    public CurrentAccount(float balance, float annualRate) {
        super(balance, annualRate);
    }

    @Override
    public void consign(float amount) {
        if (overdraft == 0) {
            super.consign(amount);
            System.out.println("Ha podido consignar $" + amount + " exitosamente");
            System.out.println();
        }
            if (overdraft < 0) {
                if (amount > Math.abs(overdraft)) {
                    amount -= Math.abs(overdraft);
                    overdraft = 0;
                    super.consign(amount);
                    System.out.println("Ha podido consignar $" + amount + " exitosamente");
                    System.out.println();
                }
                if (amount <= Math.abs(overdraft)) {
                    overdraft += amount;
                    numberConsignments++;
                    System.out.println("Ha podido consignar $" + amount + " exitosamente");
                    System.out.println();
                }
            }
        }

    @Override
    public void withdraw(float amount) {
        float newBalance;
        newBalance = balance - amount;
        if (newBalance < 0){
            balance = 0;
            overdraft = newBalance;
            numberWithdrawals ++;
            System.out.println("Ha podido retirar $"+amount+" exitosamente");
            System.out.println();
        }
    }

    @Override
    public void calculateInterest() {
        super.calculateInterest();
    }

    @Override
    public void monthlyStatement() {
        super.monthlyStatement();
    }

    @Override
    public void printAccountDetails() {
        System.out.println("Datos cuenta corriente: ");
        System.out.println("Saldo de la cuenta: $"+this.balance);
        System.out.println("Comisión mensual: $"+this.monthlyCommission);
        System.out.println("Transacciones realizadas: "+(this.numberWithdrawals+this.numberConsignments));
        System.out.println("Sobregiro: $"+this.overdraft);
        System.out.println();
    }
}
