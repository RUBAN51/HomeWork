//22-08-23
//1. Area and Volume

package homeworks;

import java.util.Scanner;

interface Drawable {
	void area(double x);
	void volume(double y);
}
interface Rect{
	void area(double x,double y);
	void volume(double x, double y, double z);
}


class Square implements Drawable{
	public void area(double side) {
		
		double ar=side*side;
		System.out.println("area: "+ar);
	}
	public void volume(double side) {
		// TODO Auto-generated method stub
		double vol=side*side*side;
		System.out.println("volume: "+vol);
	}
}


class Circle implements Drawable{
	public void area(double r) {
		double a=3.14*(r*r);
		System.out.println("Area: "+a);
	}
	public void volume(double r) {
		double v=(4.0/3.0)*3.14*(r*r*r);
		System.out.println("Volume: "+v);
	}
}


class Rectangle implements Rect{
	public void area(double x , double y) {
		double a=x*y;
		System.out.println("Area: "+a);		
	}
	public void volume(double x , double y ,double z) {
		double v=x*y*z;
		System.out.println("Volume: "+v);
	}
}
public class AreaAndVolume{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the side length of Square :");
		double side = s.nextDouble();
		Drawable sq = new Square();
		sq.area(side);
		sq.volume(side);
		
		
		System.out.println("Enter the radius of Circle :");
		double radius = s.nextDouble();
		Drawable ci = new Circle();
		ci.area(radius);
		ci.volume(radius);
		
		
		Rect r = new Rectangle();
		System.out.println("Enter The Length of Rectangle:");
		double len=s.nextDouble();
		System.out.println("Enter The Width of Rectangle:");
		double wid=s.nextDouble();
		r.area(len, wid);
		
	
	}
}

