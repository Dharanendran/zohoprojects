package APR_25_interfacetask;

public interface AB
{
	public void print();
}


class A implements AB
{

	public void print()
	{
		System.out.println("Hello");
	}
	

	public static void main(String[] args) 
	{
		A objA = new A();
		B objB = new B();
		C objC = new C(objB);
	}
}

class B implements AB 
{

	public void print()
	{
		System.out.println("World");
	}

}


class C 
{
	AB a;

	C(AB objAB) 
	{
		this.a = objAB;
		this.a.print();
	}

}
