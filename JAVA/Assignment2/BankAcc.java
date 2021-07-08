   class bank {

    int account_No;
    String name;
    String acctype;
    static int amount;
    static int fdTotal;
    static int ccTotal;

    static int bankTotal;

    public bank(int account_No,String name, int amount, String acctype){
        this.account_No = account_No;
        this.name = name;
        this.acctype = acctype;
        this.amount = amount;

    }

    public int getAccount_No() {
        return account_No;
    }

    public String getName() {
        return name;
    }

    public String getAcc_type() {
        return acctype;
    }

    public int getAmount() {
        return amount;
    }

    public static int getSavingsTotal() {
        return fdTotal;
    }
    public static int getCurrentTotal() {
        return ccTotal;
    }

    public static void setSavingsTotal(int amount) {
        fdTotal +=amount;
    }

    public static void setCurrentTotal(int amount) {
        ccTotal += amount;
    }

    public static int getBankTotal(){
        return bankTotal;
    }

    public void setBankTotal(){

    }


}

  class savings extends bank{
    public savings(int account_No, String name, int amount, String acctype) {
        super(account_No, name, amount, acctype);
        if((this.acctype).equals("savings")) {
            bank.setSavingsTotal(amount);
        }
        setBankTotal();
    }


    public void setBankTotal() {
        bankTotal = (getCurrentTotal()+getSavingsTotal());
    }
}

 class current extends bank{
    public current(int account_No, String name, int amount, String acctype) {
        super(account_No, name, amount, acctype);
        if((this.acctype).equals("current")) {
            bank.setCurrentTotal(amount);
            setBankTotal();
        }
    }


    public void setBankTotal() {
        bankTotal = (getCurrentTotal()+getSavingsTotal());

    }
}
public class BankAcc {
    public static void main(String[] args) {

        savings lilly = new savings(1234,"pranooj",25000,"savings");
        current manik = new current(4567,"pv",21000,"current");

        System.out.println("Total amount as a Fixed deposit in savings is "+bank.getSavingsTotal());
        System.out.println("Total amount as a cash credit in current is "+bank.getCurrentTotal());


        System.out.println("Total Amount in Bank: "+bank.getBankTotal());
    }
}
