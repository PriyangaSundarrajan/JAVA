abstract class FactoryDemo extends SmartPhone
{
 
abstract void verifyFingerPrint();
 
abstract void providePattern();
 void browser()
{
super.browser();
System.out.println("Factory Demo browsing");
}
 
boolean isOriginalPrice = false;
static int price =0;
}
