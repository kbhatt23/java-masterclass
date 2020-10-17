package tests;

public class MAthFloor {
public static void main(String[] args) {
	double d =12.688;
	int a = (int)d;
	System.out.println(a);

	//round off logic
	long b = Math.round(d);
	System.out.println(b);
	
	double c= Math.floor(d);
	System.out.println(c);
	

	double h= Math.ceil(d);
	System.out.println(h);
}
}
