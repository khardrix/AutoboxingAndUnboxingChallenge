package AutoboxingAndUnboxingChallenge;

// LEFT OFF Section 8, Part 90 AT 03:36 (03:36 - 16:49)


// IMPORTS of needed tools and plug-ins
import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        //////////       Challenge!!!!!!!       //////////
        // Your job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arrayList of Branches
        // Each Branch should have an arrayList of Customers
        // The Customer class should have an arrayList of Doubles (transactions)
        // Customer:
        // Name, and the arrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions
        // MY TEST CASES:
        Bank myBank = new Bank("UCB");
        myBank.addBranch(new Branch("Saint Leon, Indiana"));
        myBank.addBranch(new Branch("Lawrenceburg, Indiana"));
        myBank.addBranch(new Branch("Aurora, Indiana"));
        myBank.getBranches().get(0).addCustomer(new Customer("Bella", 100_000.00));
        myBank.getBranches().get(0).addCustomer(new Customer("Ryan", 100.00));
        myBank.getBranches().get(0).addCustomer(new Customer("Carmen", 500.00));
        myBank.getBranches().get(0).printCustomers();
        myBank.getBranches().get(0).addCustomer(new Customer("Bella", 12_000.00));
        myBank.getBranches().get(0).printCustomers();
        myBank.getBranches().get(0).addCustomer(new Customer("Denny", 10.00));
        myBank.getBranches().get(0).addCustomer(new Customer("Keith", 125_000.00));
        myBank.getBranches().get(0).printCustomers();
        System.out.println(myBank.getBranches());
        myBank.getBranches().get(0).getCustomers().get(0).addTransaction(350.0);
        myBank.getBranches().get(0).getCustomers().get(0).addTransaction(-15.0);
        System.out.println("$" + myBank.getBranches().get(0).getCustomers().get(0).getInitialBalance() + "\n");
        myBank.getBranches().get(0).getCustomers().get(0).printTransActions();
        myBank.getBranches().get(0).addCustomer(new Customer("Bandit", 150.00));
        myBank.getBranches().get(0).printCustomers();
        System.out.println(myBank.getBranches().get(0).getCustomerElement("Bandit"));
        myBank.addBranch(new Branch("Harrison, Ohio"));
        System.out.println(myBank.getBranches());
        myBank.printBranches();
        myBank.getBranches().get(1).addCustomer(new Customer("Bob", 100_000.00));
        myBank.getBranches().get(1).addCustomer(new Customer("Dime", 12_300.00));
        myBank.getBranches().get(1).addCustomer(new Customer("Cameron", 500.00));
        myBank.getBranches().get(1).addCustomer(new Customer("Dave", 50.00));
        myBank.getBranches().get(2).addCustomer(new Customer("Black Shepard", 10.00));
        myBank.getBranches().get(2).addCustomer(new Customer("Peanut Butter", 3.00));
        myBank.getBranches().get(2).addCustomer(new Customer("Jen", 1500.00));
        myBank.getBranches().get(2).addCustomer(new Customer("Alex", 51.00));
        myBank.getBranches().get(3).addCustomer(new Customer("Khardrix", 150_000.00));
        myBank.getBranches().get(3).addCustomer(new Customer("Dahlinore", 0.01));
        myBank.printBranches();
        myBank.getBranches().get(3).addCustomer(new Customer("Khardrix", 10_000.00));
        System.out.println(myBank.getBranches());



        // INSTRUCTOR TEST CASES:
//        BankInstructor bank = new BankInstructor("National Australia Bank");
//
//        if(bank.addBranch("Adelaide")){
//            System.out.println("Adelaide branch created");
//        }
//
//        bank.addCustomer("Adelaide", "Tim", 50.05);
//        bank.addCustomer("Adelaide", "Mike", 175.34);
//        bank.addCustomer("Adelaide", "Percy", 220.12);
//
//        bank.addBranch("Sydney");
//        bank.addCustomer("Sydney", "Bob", 150.54);
//
//        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
//        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
//        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
//
//        bank.listCustomers("Adelaide", false);
//        bank.listCustomers("Adelaide", true);
//        bank.listCustomers("Sydney", true);
//
//        bank.addBranch("Melbourne"); // <- If commented out, error message about Melbourne doesn't print
//        if(!bank.addCustomer("Melbourne", "Brian", 5.53)){
//            System.out.println("Error Melbourne branch does not exist");
//        }
//
//        if(!bank.addBranch("Adelaide")){
//            System.out.println("Adelaide branch already exists");
//        }
//
//        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)){
//            System.out.println("Customer does not exist at branch");
//        }
//
//        if(!bank.addCustomer("Adelaide", "Tim", 5.21)){
//            System.out.println("Customer Tim already exists");
//        }
    }
}
