/*Sebas*/
/*********************************************************************************
* (The Colorable interface) Design an interface named Colorable with a void      *
* method named howToColor(). Every class of a colorable object must implement    *
* the Colorable interface. Design a class named Square that extends              *
* GeometricObject and implements Colorable. Implement howToColor to display the  *
* message Color all four sides.                                                  *
*                                                                                *
* Draw a UML diagram that involves Colorable, Square, and GeometricObject. Write *
* a test program that creates an array of five GeometricObjects. For each object *
* in the array, display its area and invoke its howToColor method if it is       *
* colorable.                                                                     *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;


class Untitled {
	final static int r1 = (int)(Math.random() * 20);
	final static int r2 = (int)(Math.random() * 20);
	final static int r3 = (int)(Math.random() * 20);
	final static int r4 = (int)(Math.random() * 20);
	// Create an array of five GeometricObjects
	final static GeometricObject[] source = {new Rectangle(r1, r3), new Square(r2), 
				new Circle(r3), new Rectangle(r4, r3), new Square(r3)};
	//Main Method
	public static void main(String[] args) {
	// Create an arrayList of five GeometricObjects
	ArrayList<GeometricObject> list = new ArrayList<>();

	//Add objects to ArrayList
	for(int i = 0 ; i < 8; i++){
		int rand = (int)(Math.random()*source.length);
		list.add(source[rand]);
	}
	
		
		displayRectangles(list);
		System.out.println("\n\nLet's now display the squares");
		displaySquares(list);
	}

		// Display the area and invoke the howToColor 
		// method for each GeometricObject
	public static void displayRectangles(ArrayList<GeometricObject> squares){
		try{
			for (int i = 0; i < squares.size(); i++) {
				if(squares.get(i) instanceof Rectangle ){
					System.out.println("\nObject #" + (i + 1));
					System.out.println(squares.get(i).name());
			 		System.out.println("Area: " + squares.get(i).getArea());
			 		System.out.println("How to color: " + ((Rectangle)squares.get(i)).howToColor());
				}
			}
		}catch(ClassCastException ex){
			System.out.println("\nThis class is not a square");
		}
	}
	public static void displaySquares(ArrayList<GeometricObject> squares){
			try{
				for (int i = 0; i < squares.size(); i++) {
					if(squares.get(i) instanceof Square ){
						System.out.println("\nObject #" + (i + 1));
						System.out.println(squares.get(i).name());
				 		System.out.println("Area: " + squares.get(i).getArea());
				 		System.out.println("How to color: " + ((Square)squares.get(i)).howToColor());
					}
				}
			}catch(ClassCastException ex){
				System.out.println("\nThis class is not a square");
			}
		}
}
		
		