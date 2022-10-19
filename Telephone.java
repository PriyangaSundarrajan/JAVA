class Telephone
    {
      int price=1500;
      String name="Phone";
    public void call()
        {
           System.out.println("Calling Facility"); 
        }
    public void received_call()
         {
           System.out.println("Receiving call facility"); 
         }
    public static void main(String[] args)
        {
           Telephone bsnl = new Telephone(); 
           bsnl.call();
           bsnl.received_call();
           System.out.println(bsnl.name);
           System.out.println(bsnl.price);
        }

}
