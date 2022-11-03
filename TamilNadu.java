package scenario_4;
import scenario_4.SouthIndia;
public class TamilNadu extends SouthIndia
{
static String capital = "Chennai";
 
public static void main(String[] args)
{

SouthIndia si = new TamilNadu();

System.out.println("TamilNadu Capital is "+ capital);
System.out.println("India Capital is "+ si.capital);
si.speakLanguage();
si.eat();
si.dress();
si.cultivate();
si.livingStyle();
}
public void speakLanguage() 
{
System.out.println("TamilNadu Mother tongue is Tamil.");
}
public void eat()
{
System.out.println("Tamil People mostly eat consumed by Rice and Millet Products. ");
}
  
public void dress() 
{
System.out.println("TamilNadu People wear own Traditional Dresses.");
}
void cultivate()
{
System.out.println("Rice and Sugar cane cultivation");
}
 
void livingStyle()
{
System.out.println("Above Average development");
}
}
