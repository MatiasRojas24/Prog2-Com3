public class SavingsAccount extends Account{
    private boolean accountIsActive;

    public SavingsAccount(float balance, float annualRate) {
        super(balance, annualRate);
        if (balance >= 10000){this.accountIsActive = true;}else{this.accountIsActive = false;}
    }

    @Override
    public void consign(float amount) {
        if (this.accountIsActive) {
            super.consign(amount);
            System.out.println("Ha podido consignar $"+amount+" exitosamente");
            System.out.println();
        }else{
            System.out.println("No puede consignar dinero. La cuenta está inactiva");
            System.out.println();
        }
    }

    @Override
    public void withdraw(float amount) {
        if (this.accountIsActive) {
            super.withdraw(amount);
            System.out.println("Ha podido retirar $"+amount+" exitosamente");
            System.out.println();
            if (this.numberWithdrawals > 4){
                    this.monthlyCommission = 1000;
                    System.out.println("Se le ha cobrado un extracto mensual de $1000");
                    System.out.println();
                    monthlyStatement();
            }
        }else{
            System.out.println("No puede retirar dinero. La cuenta está inactiva");
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
        if (this.balance < 10000){this.accountIsActive = false;}
    }

    @Override
    public void printAccountDetails() {
        System.out.println("Datos cuenta de ahorros: ");
        System.out.println("Saldo de la cuenta: $"+this.balance);
        System.out.println("Comisión mensual: $"+this.monthlyCommission);
        System.out.println("Transacciones realizadas: "+(this.numberWithdrawals+this.numberConsignments));
        System.out.println();
    }
}
