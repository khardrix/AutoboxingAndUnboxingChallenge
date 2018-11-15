package AutoboxingAndUnboxingChallenge;


// IMPORTS of needed tools and plug-ins
import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;


    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }


    public String getName() {
        return name;
    }


    public ArrayList<Branch> getBranches() {
        return branches;
    }


    public void addBranch(Branch newBranch){
        this.branches.add(newBranch);
    }


    public void printBranches(){
        System.out.println();
        for(int i = 0; i < this.branches.size(); i++){
            System.out.println("Branch #" + (i + 1) + ".) " + this.branches.get(i).getName());
            System.out.println("-----------------------------------------");
            ArrayList<Customer> customers = this.branches.get(i).getCustomers();
            for(int j = 0; j < customers.size(); j++){
                Customer customer = this.branches.get(i).getCustomers().get(j);
                System.out.println("Customer: " + customer.getName());
                ArrayList<Double> transactions = customer.getTransactions();
                for(int k = 0; k < transactions.size(); k++){
                    System.out.println("    Transaction #" + (k + 1) + "  =  $" + transactions.get(k));
                }
                System.out.println("-    -    -    -    -    -    -    -    -");
            }
            System.out.println("_________________________________________");
        }
        System.out.println();
    }
}
