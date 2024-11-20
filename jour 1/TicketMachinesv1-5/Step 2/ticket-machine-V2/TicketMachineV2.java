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
public class TicketMachineV2
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The number of tickets the machine delivered since its activation
    public int numberOfTickets;
    // The total amount of money collected by this machine.
    private int total;
    
    private int Money;
    
    private int newBalance;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachineV2(int cost)
    {
        price = cost;
        balance = 0;
        numberOfTickets = 0;
        total = 0;
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
    public void setPrice(String password, int newPrice)
    {
        this.price = newPrice;
    }
    
    private String password = "myPassword";
    
    private void changePassword(String oldPassword, String NewPassword)
    {
        
    };
        
    /**
     * Return the number of tickets already delivered by the machine.
     */
    public int getNumberOfTickets()
    {
        return numberOfTickets;
    }

    private int collectMoney(String password)
    {
        Money = total;
        newBalance = 0;
        return newBalance;
    };

    /**
     * Return the total of money already recorded by the machine.
     */
    public int getTotal()
    {
        return total;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        if (amount > 0) balance = balance + amount;
        if (amount > price) System.out.println("too much money");
        balance = balance +(amount - price);
        
    }

    public void getAbort() {
    System.exit(0);  
    }

    
    
   // public void refund (refundAvailable)
    //{
    //    if refundAvailable int refund = balance - price;
    //    System.out.println("Refund: " + refund + " cents.");
    //}
    
    //private void changePassword(String oldPassword, String NewPassword)
    //{
     //   if (NewPassword.length>1) 
     //       oldPassword = NewPassword;
    //}
    
    //public void abort ()
    //{
    //    System.exit();
    //}
    /**
     * Deliver a ticket.
     * Update the total collected,
     * and the number of delivered tickets
     * Reduce the balance to zero.
     */
    public void deliverTicket()
    {
        if (balance >= price) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();
            
            if (balance < price) {
            System.out.println("incorrect amount");
        } else {
            System.out.println("not enough");
            return;
        }
            
            int refund = balance - price;
            if (refund > 0)
                System.out.println("Refund: " + refund + " cents.");
    
            // Update the total collected with the ticket price.
            total = total + price;
            // Increment the number of delivered tickets
            numberOfTickets++;
            // Clear the balance.
            balance = 0;     
        }
    }
}
