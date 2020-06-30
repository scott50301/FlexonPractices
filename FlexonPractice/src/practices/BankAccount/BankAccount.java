package practices.BankAccount;


public class BankAccount {
    int accountNumber;
    float balance;
    String customerName;
    String email;
    long phoneNumber;

    public BankAccount(){
        accountNumber = 123456789;
        balance = 50;
        customerName = "Scott";
        email = "scott60301@gmail.com";
        phoneNumber = 6692378432L;
    }
    public void deposit(float money){
        balance += money;
        System.out.println("The balance with "+customerName+"'s account is "+ balance);
    }

    public void withdraw(float money){
        if (balance < money){
            System.out.println("The balance with "+customerName+"'s account is insufficient, current balance "+ balance);
            return;
        }

        balance -= money;
        System.out.println("The balance with "+customerName+"'s account is "+ balance);
    }

    public void printInfo(){
        System.out.println("accountNumber:"+accountNumber);
        System.out.println("balance:"+balance);
        System.out.println("customerName:"+customerName);
        System.out.println("email:"+email);
        System.out.println("phoneNumber:"+phoneNumber);
    }
}
