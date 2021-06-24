abstract class Shape
{
	double h,w;
	Shape(double h, double w)
	{
		this.h = h;
		this.w = w;
	}
	abstract double area();
}
class Rect extends Shape
{
	Rect(double h, double w)
	{
		super(h,w);
	}
	double area()
	{
		return w*h;
	}
}
class Tringle extends Shape
{
	Tringle(double h, double w)
	{
		super(h,w);
	}
	double area()
	{
		return 0.5*w*h;
	}
}
class _31_abstract_class
{
	public static void main(String[] args) {
		Shape ref;
		Rect r = new Rect(10,15);
		ref = r;
		System.out.println("Area of Rectangle = "+ref.area());

		Tringle t = new Tringle(15,20);
		ref = t;
		System.out.println("Area of Tringle = "+ref.area());
	}
}

/*
Area of Rectangle = 150.0
Area of Tringle = 150.0
*/