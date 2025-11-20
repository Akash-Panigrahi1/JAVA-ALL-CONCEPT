class A
{
	static int i=10;
	static{
		m1();
		System.out.println("A-FSB");
	}
	public static void main(String[] args){
		m1();
		System.out.println("A- Main");
	}
	public static void m1(){
		System.out.println(j);
	}
	static{
		System.out.println("A-SSB");
	}
	static int j=20;
}
class B extends A
{
	static int x=100;
	static{
		m2();
		System.out.println("B-FSB");
	}
	public static void main(String[] args){
		m2();
		System.out.println("B-Main");
	}
	public static void m2(){
		System.out.println(y);
	}
	static{
		System.out.println("B-SSB");
	}
	static int y=200;
} 