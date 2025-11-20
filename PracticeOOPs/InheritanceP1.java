class Demo
{
	public static void main(String[] args) 
	{
		A a=new B(); // Upcasting 
		B b= (B) a; //Downcasting
		a.m1(); 
		b.m2();
	}
}
class A
{
	public void m1(){
		System.out.println("Akash");
}
}
class B extends A
{
	public void m2(){
		System.out.println("Panigrahi");
}
}