
class DefaultConstructor extends A
{
	static{
		System.out.println("DefaultConstructor class static method");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method Starts");
		DefaultConstructor dc=new DefaultConstructor();
		System.out.println("Main Method ends");
	}
}
class A
{
	
	static{
		System.out.println("A class static method");
	}
	A(){
		System.out.println("Parent class Constructor");
	}
}
