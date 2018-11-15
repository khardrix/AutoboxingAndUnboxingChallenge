package AutoboxingAndUnboxingChallenge;


// IMPORTS of needed tools and plug-ins
import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;
    private static int branchCount = 0;
    private int branchIDNum;


    public Branch(String name) {
        branchCount++;
        branchIDNum = branchCount;

        this.name = name;
        this.customers = new ArrayList<Customer>();
    }


    public String getName() {
        return name;
    }


    public ArrayList<Customer> getCustomers() {
        return customers;
    }


    public int getBranchIDNum() {
        return branchIDNum;
    }


    public void addCustomer(Customer customer){
        if(!checkIfCustomerExists(customer.getName())) {
            this.customers.add(customer);
        }else{
            System.out.println(customer.getName() + " already exists. \n");
        }
    }


    private boolean checkIfCustomerExists(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            String existingCustomerName = this.customers.get(i).getName();
            if (existingCustomerName.toLowerCase().equals(name.toLowerCase())) {
                return true;
            }
        }
        return false;
    }


    public void printCustomers(){
        for(int i = 0; i < this.customers.size(); i++){
            System.out.println(this.customers.get(i));
        }
    }


    public int getCustomerElement(String name){

        for(int i = 0; i < this.customers.size(); i++){
            String nameMatch = this.customers.get(i).getName();

            if(nameMatch.equals(name)){

                return i;
            }
        }
        return -1;

    }


    public String toString(){
        return "\nID#: " + this.branchIDNum + "  -  " + this.name + "\n";
    }
}
