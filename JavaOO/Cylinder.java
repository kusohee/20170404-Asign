package prj;

public class Cylinder {
	public Circle cir;
	public double height;
	public double getVolume(){
		return cir.getArea() * height;
 }
 
	public static void main(String[] args) {
		
		Cylinder cd = new Cylinder();
		cd.cir = new Circle(2.8);
		cd.height = 5.6;
		System.out.println(cd.getVolume());
	}

}