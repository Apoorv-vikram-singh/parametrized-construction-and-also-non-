class kapil
{
	kapil()
	{
		System.out.println("KAPIL..nonPARA CONSTRUCTER..BASE");
	}
	kapil(int a)
	{
		System.out.println("kapil.. para constructor..derived");
	}
	public static void main(String args[])
	{
		kapil onj=new kapil();
		kapil obj1=new kapil(8);

}

}