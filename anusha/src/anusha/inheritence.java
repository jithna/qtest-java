package anusha;
class one {
	public void print_abcd()
	{
		System.out.println("abcd");
	}
	} 
class two extends one {
	public void print_efgh()
	{
		System.out.println("efgh");
	}
	
	}
	


public class inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        two g = new two();



        g.print_abcd();



        g.print_efgh();



        g.print_abcd();




	}

}
