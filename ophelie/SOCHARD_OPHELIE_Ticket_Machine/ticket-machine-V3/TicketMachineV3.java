/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Köllingrard
 * @author Patrick Girard
 * @version 2019.08.13
 */
public class TicketMachineV3
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The number of tickets the machine delivered since its activation
    public int numberOfTickets;
    // The total amount of money collected by this machine.
    private int total;
    // Amount refundable
    private boolean refundAvailable;
    
    private String password;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachineV3(int cost)
    {
        price = cost;
        balance = 0;
        numberOfTickets = 0;
        total = 0;
        refundAvailable = false;
        password = "myPassword";
    }
    
    public void setPrice(String inputPassword, int newPrice){
        if (inputPassword.equals(this.password)){
            this.price = newPrice;
        }
        else {
            System.out.println("Wrong password !");
        }
    }
    
    public int collectMoney(String inputPassword){
        if (inputPassword.equals(this.password)){
            int collectedAmount = this.total;
            this.total = 0;
            return collectedAmount;
        }
        else {
            System.out.println("Wrong password !");
            return 0;
        }
    }
    
    public void changePassword(String oldPassword, String newPassword){
        if (oldPassword.equals(this.password) == true) {
            if (newPassword.length() >= 5) {
                this.password = newPassword;
            }
        }
        else {
            System.out.println("ERROR");
        }
    }
    
    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Set the total attribute
     */
    public void setPrice(int newPrice)
    {
        this.price = newPrice;
    }

    /**
     * Return the number of tickets already delivered by the machine.
     */
    public int getNumberOfTickets()
    {
        return numberOfTickets;
    }


    /**
     * Return the total of money already recorded by the machine.
     */
    public int getTotal()
    {
        return total;
    }
    
    /**
     * Refund the extra change
     */
    public void refund()
    {
        if (refundAvailable == true) {
            System.out.println("Refunding: " + balance + " cents.");
            balance = 0;
            refundAvailable = false;
        }
    }
    
    /**
     * Abort the mission
     */
    public void abort()
    {
        System.out.println("Abort. Refunding: " + balance + " cents.");
        balance = 0;
    }
 
    
    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        if (amount > 0) {
            if(refundAvailable == false) { 
                if (balance < price) {
                    balance = balance + amount;
                }   
            }
        }
    }

    /**
     * Deliver a ticket.
     * Update the total collected,
     * and the number of delivered tickets
     * Reduce the balance to zero.
     */
    public void deliverTicket()
    {
        if (balance >= price) {
            if (refundAvailable == false) {
                // Simulate the printing of a ticket.
                System.out.println("##################");
                System.out.println("# The BlueJ Line");
                System.out.println("# Ticket");
                System.out.println("# " + price + " cents.");
                System.out.println("##################");
                System.out.println();
                
                balance = balance - price;  
                
                if(balance > 0) {
                    refundAvailable = true;
                }
                
                // Update the total collected with the ticket price.
                total = total + price;
                // Increment the number of delivered tickets
                numberOfTickets++;  
            }
        }
    }
}    