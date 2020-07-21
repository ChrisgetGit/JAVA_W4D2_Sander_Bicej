package Christian.Intermediate.A6;

public class CreditCard extends BankAccount {
    public CreditCard(String customer) {
        super(customer);
    }

    public void widrawMoney(float withdraw) {
        float newBalance = getCreditbalance();
        try {
            if ((newBalance - withdraw < -3500)) {
                throw new BankAcccountNegativeException("Insufficient funds!!\n");
            }else
                setCreditbalance(newBalance - withdraw);
            System.out.println("\n"+getCustomer()+" withdrew: " + withdraw + "\nhis credit balance is now: "+ getCreditbalance());
        }catch (BankAcccountNegativeException b){
            System.out.println("\n"+getCustomer() +" tried to withdraw: " + withdraw +" €, but your account only holds: "+ getCreditbalance());
            System.out.println(b.getMessage());

        }


    }
    public void addMoney (float add){
        float newBalance = getCreditbalance();
        setCreditbalance(newBalance + add);
        System.out.println("\n"+getCustomer() +" added: " + add + "\n -his new balance is: "+ getCreditbalance());
    }

}
