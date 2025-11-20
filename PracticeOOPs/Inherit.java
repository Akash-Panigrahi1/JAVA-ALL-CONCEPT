class Parent {
	public static void m1(){
		System.out.println("Parent class");
	}
}
class Inherit extends Parent{
	public static void main(String[] args){
		Inherit i=new Inherit();
		i.m1();
		Parent p=new Parent();
		p.m1();
		Parent p1=new Inherit();
		p.m1();
	}
}