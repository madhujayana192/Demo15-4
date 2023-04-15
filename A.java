class A {
	public static void main(String args[]) {
		System.out.println("In main method");
		B obj1=new B();
		obj1.sum(10,20);
		obj1.sum(10,20,30);
		C obj2=new C();
		obj2.sum(10,20);
		obj2.sum(10,20,30);
		D obj3=new D();
		obj3.m1();
	}
}
