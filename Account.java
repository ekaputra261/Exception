public class Account {
    protected double balance;
    protected Account(double initBalance){
        balance = initBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amt){
        balance = balance + amt;
    }
    public void withdraw(double amt) throws Overdraft{
        if(amt <= balance){
            balance = balance - amt;
        }
        else{
            throw new Overdraft("Dana Tidak Cukup ", amt-balance);
        }
    }
}
