class ActorSivakumar implements Actor
{

static String address = "Coimbatore";
 ActorSivakumar()
{
System.out.println("ActorSivaKumar Constractor Zero-args Constructor.");
}
ActorSivakumar(int age, String car)
{
System.out.println("Sivakumar Age is "+age);
System.out.println("Sivakumar Car Name is "+car);
 
}
public static void main(String[] args)
{
ActorSivakumar as= new ActorSivakumar(65, "Audi Car");
as.act();
as.dance();
as.sing();
as.speaking();
System.out.println("Sivakumar address is "+address);
Actor ac =new ActorSivakumar();
ac.act();
ac.dance();
ac.sing();
System.out.println("Sivakumar address is "+address);
}
void speaking()
{
System.out.println("Sivakumar Speaking");
}
public void act()
{
System.out.println("Sivakumar Acting");
}
public void dance()
{
System.out.println("Sivakumar Dancing");
}
public void sing()
{
System.out.println("Sivakumar Singing");
}
}
