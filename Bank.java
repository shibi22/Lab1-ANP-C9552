class Bank {
    private double amount;


    public Bank(double amount) {
        this.amount = amount;
    }

    public void withdraw(double withdrawalAmount) {
        
        String message = (withdrawalAmount <= amount) ? "Withdraw successful" : "Insufficient balance";
        System.out.println(message);
        
       
        amount = (withdrawalAmount <= amount) ? amount - withdrawalAmount : amount;
    }

    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
       
        Bank myAccount = new Bank(10000);

        myAccount.withdraw(3000);
		
        myAccount.deposit(5000);

        myAccount.displayBalance();
    }
}
