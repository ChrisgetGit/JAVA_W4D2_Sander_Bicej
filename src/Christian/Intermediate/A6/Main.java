package Christian.Intermediate.A6;

public class Main {

    public static void main(String[] args) throws BankAcccountNegativeException {
        DebitCard cust1 = new DebitCard("Christian Sander");
        DebitCard cust2 = new DebitCard("Max Mueller");
        CreditCard cust3 = new CreditCard("Thomas Mueller");


        cust1.widrawMoney(100);
        cust1.addMoney(200);
        cust1.widrawMoney(150);
        cust1.widrawMoney(75);

        cust2.widrawMoney(200);
        cust2.addMoney(1000000);

        cust3.widrawMoney(2100);
        cust3.addMoney(1800);
    }
}

