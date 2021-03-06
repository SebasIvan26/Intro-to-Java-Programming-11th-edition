public class Rectangle
		extends GeometricObject implements Colorable {
	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(
		double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(String color, boolean filled, double width, double height) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}

	/** Return width */
	public double getWidth() {
		return width;
	}

	/** Set a new width */
	public void setWidth(double width) {
		this. width = width;
	}

	/** Return height */
	public double getheight() {
		return height;
	}

	/** Set a new height */
	public void setheight(double height) {
		this.height = height;
	}
	@Override
	public String name(){
		return "Rectangle";
	}

	@Override /** Return area */
	public double getArea() {
		return width * height;
	}

	@Override /** Return perimeter */
	public double getPerimeter() {
		return 2 * (width * height);
	}
	@Override
	public String howToColor(){
			return "Color the length and widths" ;
	}

	@Override /** Return String discription of this rectangle */
	public String toString() {
		return super.toString() + "\nWidth: " + width + "\nHeight: " + height
			+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}