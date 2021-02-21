package OOP.accountsQuestion;

public class account {

    //account number
    private int accountNumber;
    //balance
    private float balance;
    //name
    private String name;
    //email
    private String email;
    //phonenumber
    private int phoneNumber;

    //ACCESSORS
    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    //MUTATORS
    public void setName(String name) {
        this.name = name;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void depositAmount(float depositAmount){
        this.balance = this.balance + depositAmount;
    }

    public void withdrawAmount(float withdrawAmount){
        if (this.balance <= 0){
            System.out.println("No Balance to withdraw");
        }else{
            this.balance = this.balance - withdrawAmount;
            System.out.println(withdrawAmount+ " has been withdrawn" + " New Balance :" + this.balance);
        }
    }


}
