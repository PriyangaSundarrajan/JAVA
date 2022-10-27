abstract class Car
    {
        Car()
    {
        System.out.println("Car Constructor "); 
    }
public static void main(String[] args)
    {
      
       

    }
        abstract void accelerate(); 

        abstract void applyBrakes();

        final void fixairbags()
    {
        System.out.println("Air bags"); 
    }
}
