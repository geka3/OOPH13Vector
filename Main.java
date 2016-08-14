package net.ukr.geka3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vOne = new Vector(4,5,6);
		Vector vTwo = new Vector(7,8,9);
		System.out.println("vOne is " + vOne.toString());
		System.out.println("vTwo is " + vTwo.toString());
		System.out.println("Cos vOne vTwo is " + Vector.getCos(vOne, vTwo));
		System.out.println("Sum vOne vTwo is " + Vector.Sum(vOne, vTwo));
		System.out.println("Scalar Multiplication of vOne and vTwo is " + Vector.scalarMultiplication(vOne, vTwo));
		System.out.println("Vector Multiplication of vOne and vTwo is " + vOne.vectorMultiplication(vTwo));
	}

}
