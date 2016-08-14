package net.ukr.geka3;

public class Vector {
	private double a;
	private double b;
	private double c;

	public Vector(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Vector() {
		super();
	}

	

	// | a1 b1 |
	// | a2 b2 |
	static public double getDeterminant(double a1, double b1, double a2, double b2) {//
		return (a1 * b2 - b1 * a2);
	}

	static public double getVectorDistance(Vector vector) {
		return Math.sqrt(vector.a * vector.a + vector.b * vector.b + vector.c * vector.c);
	}

	static public double getCos(Vector vectorOne, Vector vectorTwo) {
		return (scalarMultiplication(vectorOne, vectorTwo))
				/ (getVectorDistance(vectorOne) * getVectorDistance(vectorTwo));
	}

	static public double scalarMultiplication(Vector vectorOne, Vector vectorTwo) {
		return vectorOne.a * vectorTwo.a + vectorOne.b * vectorTwo.b + vectorOne.c * vectorTwo.c;
	}

	static public Vector Sum(Vector vectorOne, Vector vectorTwo){
		return new Vector(vectorOne.a + vectorTwo.a, vectorOne.b + vectorTwo.b , vectorOne.c + vectorTwo.c );
	}
	public Vector vectorMultiplication(Vector vectorTwo) {
		double a = getDeterminant(this.b, this.c, vectorTwo.b, vectorTwo.c);
		double b = getDeterminant(this.a, this.c, vectorTwo.a, vectorTwo.c);
		double c = getDeterminant(this.a, this.b, vectorTwo.a, vectorTwo.b);
		return new Vector(a, -b, c);

	}
	
	
	
	@Override
	public String toString() {
		return "Vector [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}
	
	
	
	
	
}
