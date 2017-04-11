interface i1{
	void base();
	void base2();
}
interface i2{
	void base3();
}
interface i3 extends i1{
	
}
interface i4 extends i1,i2{
	
}
class BaseClass implements i1{
    public void base(){
    	System.out.println("Base method");
    }
    public void base2(){
    	
    }
}
class Baseclass2 implements i2{
	public void base3(){
		System.out.println("base 2 method");
	}
	public void base(){
		System.out.println("local method");
	}
}
class interfaceclass implements i1,i2{
	public void base(){
		
	}
	public void base2(){
		
	}
	public void base3(){
		
	}
}
public class DerivedClass extends BaseClass implements i1 {
	public void derived(){
		System.out.println("derived method");
	}
	public void base(){
		
	}
	public void base2(){
		
	}
	public static void main(String a[]){
		DerivedClass d = new DerivedClass();
		d.base();
		d.derived();
	}
}
