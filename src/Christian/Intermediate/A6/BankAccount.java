package Christian.Intermediate.A6;

public class BankAccount {

    private String customer;
    private float balance;
    private float creditBalance;




    public BankAccount(String customer){
        this.customer = customer;
        this.balance = getBalance();
        this.creditBalance = getCreditbalance();



    }


    public void widrawMoney(float withdraw) {
        float newBalance = getBalance();
        try {
            if ((newBalance - withdraw < 0)) {
                throw new BankAcccountNegativeException("Insufficient funds!!\n");
            }else
            setBalance(newBalance - withdraw);
            System.out.println(customer+" withdrew " + withdraw + "\n -he has now a balance of: "+ balance+" €");
        }catch (BankAcccountNegativeException e){
            System.out.println("\n"+customer +" tried to withdraw: " + withdraw +" € , but his account only holds: "+ balance);
            System.out.println(e.getMessage());

            }


    }

    public void addMoney (float add){
        float newBalance = getBalance();
        setBalance(newBalance + add);
        System.out.println("\n"+customer +" added: " + add + "\n -his new balance is: "+ balance);
    }

    public float getCreditbalance() {
        return creditBalance;
    }

    public void setCreditbalance(float creditBalance) {
        this.creditBalance = creditBalance;
    }

    public float getBalance() {
        return balance;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public float getBalance(float balance) {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }


}

/*
A6:  BankAccount: Exception on trying to set accountBalance to a negative number.

        1. Create a BankAccount class that holds customer name and account balance. Add

        getters and setters, as well as two methods addMoney(amount) and widrawMoney(amount).

        2. Raise an BankAcccountNegativeException (custom exception) when an attempt  has been made to set the account balance to negative. Demonstrate exception handling in main() with an example.

        3. Add classes DebitCardAccount and CreditCardAccount, which are child classes of

        BankAccount. Add necessary fields (e.g a credit card account can go -3500, a debit card account can only go to 0).

        4. Demonstrate that the exception still works for child classes.*/