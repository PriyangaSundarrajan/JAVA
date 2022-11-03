abstract class SmartPhone
{
abstract int call(int seconds);
abstract void sendMessage();
abstract void receiveCall();
void browser()
{
System.out.println("SmartPhone browsing");
}
public SmartPhone()
{
System.out.println("Smartphone under development");
}
}
