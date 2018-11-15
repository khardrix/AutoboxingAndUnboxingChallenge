package AutoboxingAndUnboxingChallenge;


// IMPORTS of needed tools and plug-ins
import java.util.ArrayList;

public class Customer {

    private String name;
    private double initialBalance;
    private double runningBalance;
    private ArrayList<Double> transactions;


    public Customer(String name, double initialBalance) {
        this.name = name;
        this.initialBalance = initialBalance;
        this.runningBalance = initialBalance;
        this.transactions = new ArrayList<Double>();
    }


    public String getName() {
        return name;
    }


    public ArrayList<Double> getTransactions() {
        return transactions;
    }


    public double getInitialBalance() {
        return initialBalance;
    }


    public double getRunningBalance(){
        this.runningBalance = this.initialBalance;

        for(int i = 0; i < transactions.size(); i++){
            runningBalance += transactions.get(i);
        }

        return runningBalance;
    }


    public void addTransaction(double amount){

        this.transactions.add(amount);

        if(amount < 0){
            amount *= -1;
            System.out.println(this.name + " with a balance of $" +
                    String.format("%.2f", this.runningBalance) +
                    ", has withdrawn $" + String.format("%.2f", amount) +
                    "\nNew Balance: $" + String.format("%.2f", getRunningBalance()) + "\n");
        }else{
            System.out.println(this.name + " with a balance of $" +
                    String.format("%.2f", this.runningBalance) +
                    ", has deposited $" + String.format("%.2f", amount) +
                    "\nNew Balance: $" + String.format("%.2f",  getRunningBalance()) + "\n");
        }
    }


    public void printTransActions(){

        double transactionsTotal = 0;
        System.out.println("\n_________________________________ \n" +
                this.name + " - transactions: " + "\n---------------------------------");
        for(int i = 0; i < this.transactions.size(); i++){
            transactionsTotal += this.transactions.get(i);
            System.out.println((i+ 1) + ".) $" + String.format("%.2f", this.transactions.get(i)));
        }
        System.out.println("_________________________________ " +
                "\nInitial balance: $" + String.format("%.2f", this.initialBalance) +
                "\nTotal of transactions: $" + String.format("%.2f", transactionsTotal) +
                "\n_________________________________" +
                "\nCurrent balance: $" + String.format("%.2f", this.runningBalance) +
                "\n---------------------------------" +
                "\n_________________________________ \n");
    }


    public String toString(){
        return "Customer name: " + this.getName() +
                "\nAvailable balance: $" + String.format("%.2f", this.runningBalance) +
                "\n-    -    -    -    -    -    -    -";
    }
}
