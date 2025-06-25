class Q12_BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    public Q12_BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class Q12_SavingsAccount extends Q12_BankAccount {
    public double interestRate;
    public Q12_SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    public void display() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + accountHolder + ", Interest Rate: " + interestRate);
    }
    public static void main(String[] args) {
        Q12_SavingsAccount sa = new Q12_SavingsAccount("987654", "Alice", 10000, 4.5);
        sa.display();
        System.out.println("Balance: " + sa.getBalance());
        sa.setBalance(12000);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
