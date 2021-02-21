package OOP.accountsQuestion;


import OOP.accountsQuestion.account;

public class bank {
    public static void main(String[] args) {

        account a = new account();
        a.setName("Aditya");
        a.depositAmount(1000);
        a.setEmail("abhanda1@ramapo.edu");
        a.setAccountNumber(012345);

        a.withdrawAmount(50);



    }
}
