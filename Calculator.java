class Calculator
{
public static void main(String[] args)
{
Calculator calc = new Calculator();// Constructor:
//using calculator Iam going to add two numbers
calc.add();
calc.subtract();
calc.multiply();
calc.divide();
// . -->dot operator
}
void multiply()
{
System.out.println(10*20);
}
void divide()
{
System.out.println(10/20);
}
void subtract()
{
System.out.println(10-20);
}
void add()
{
System.out.println(10+20);
}
}
