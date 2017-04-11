abstract class abstractclass{
	void localmethod(){
		
	}
	abstract void method();
	void localmethod1(){
		
	}
}
class Abstractderived1 extends abstractclass{
	public void method(){
		System.out.println("derived1 class");
	}
}
public class AbstractDerived extends abstractclass{
public void method(){
	System.out.println("derived class");
}
public static void main(String a[]){
	AbstractDerived ad = new AbstractDerived();
	ad.method();
	ad.localmethod();
	ad.localmethod1();
}
}
