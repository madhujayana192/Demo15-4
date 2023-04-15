class B {
	void sum(int x,int y) {
		System.out.println("In B, sum method with two parameters ");
		System.out.println(x+y);
	}
	void sum(int x,int y, int z) {
		System.out.println("In B, sum method with three parameters ");
		System.out.println(x+y+z);
	}
}

class C extends B{
	void sum(int x,int y) {
		System.out.println("In C, sum method with two parameters ");
		System.out.println(x-y);
	}
}

interface i1 {
	void m1();
}

class D implements i1{
	public void m1() {
		System.out.println("In D, method m1");
	}
}

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
		