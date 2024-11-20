/**
 * TicketMachineV0 models a naive ticket machine that issues
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
public class TicketMachineV1
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The number of tickets the machine delivered since its activation
    public int numberOfTickets;
    // The total amount of money collected by this machine.
    private int total;
    
    private int refund;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachineV1(int cost)
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
     * Receive an amount of money from a customer.
     */
    private void insertMoney(int amount, int price)
    {
        if (amount > price) balance = balance + amount;
        if (amount < 0) System.out.println("incorrect amount");
    }

    /**
     * Deliver a ticket.
     * Update the total collected,
     * and the number of delivered tickets
     * Reduce the balance to zero.
     */
    public void deliverTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();
        if (balance >= price) // Update the total collected with the balance.
        total = total + balance;
        refund = balance - price;
        System.out.println("Change" + refund);
        // Clear the balance.
        balance = 0;
        
        // Increment the number of delivered tickets
        numberOfTickets++;
        
    }
}
