class AP
{
	public static void m1(){
		System.out.println("inside m1-A");
	}
}  
class BP extends AP
{
	public static void m1(){
		System.out.println("inside m1-B");
	}
	public static void main(String[] args){
		BP b=new BP();
		b.m1();   //inside m1-B
		AP a=new BP();   //upcasting
		a.m1();			//Method hidining // inside m1-A
		AP a1=new AP();
		a1.m1();         //inside m1-A
	}
}