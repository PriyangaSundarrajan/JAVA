class Theatre
{
public static void main(String[] ticket booking)//main method,instead of args we can place any variable
{
Theatre raja =new Theatre();//creating an object
int balance_amount= raja.bookTicket(200);//method calling

}
int bookTicket(int price)
{
int ticket_price=120;
int balance= price-ticket_price;
System.out.println("Balance amount"+balance);//Example of concatenation operator
return balance;
}
}
