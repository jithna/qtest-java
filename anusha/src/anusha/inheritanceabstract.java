package anusha;
abstract class shape{
abstract void draw();
}
class rectangle extends shape{
	void draw() {System.out.println("drawing rectangle");}
}
class circle1 extends shape{
	void draw(){System.out.println("drawing circle1");}
}
	

public class inheritanceabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
shape s= new circle1();
s.draw();
	}

}
