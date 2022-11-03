package scenario_4;
public abstract class India
{
static String capital = "New Delhi";
abstract void speakLanguage();
abstract void eat();
abstract void dress();
public India(String primeMinister)
{
System.out.println("Our Prime Minister is " + primeMinister);
}
public India() 
{
this("Narendira Modi");
}
 
}
