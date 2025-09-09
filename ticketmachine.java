/**
 * Ticket Machine 
 * @author hilman
 * @version 9/9/2025
 */

public class TicketMachine
{
    private int price;
    private int balance;
    private int total;
    
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public int getBalance()
    {
        return balance;
    }
    
    public void insert (int amount)
    {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Gunakan angka positif lebih dari " + amount);
        }
    }
    
    public void printTicket()
    {
        if (balance >= price) {
            System.out.println("##########");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents");
            System.out.println("##########");
            System.out.println();
        
            total += price;
            balance -= price;
        } else {
            System.out.println("Saldo kamu kurang. Silahkan tambah saldo terlebih dahulu minimal " +
            (price - balance) + " cents");
        }
    }
    
    public int refundBalance()
    {
        int amountRef;
        amountRef = balance;
        balance = 0;
        return amountRef;
    }
}
