package challenge1;

public class Point {
	public static void main(String[] args) {
		Point p = new Point();
		Point p1 = new Point(3, 5);
		System.out.println(p1.distance(p));
	}
	private int x;
	private int y;
	public Point() {
		this.x= this.y=0;
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double distance() {
		//diff between 0,0 and this point
		return Math.sqrt((Math.pow(this.x, 2)) + (Math.pow(this.y, 2)));
	}
	public double distance(int a , int b) {
		int diffXaxis = (x > a) ? x-a : a-x;
		int diffYaxis = (y > b) ? y - b: b-y;
		return Math.sqrt((Math.pow(diffXaxis, 2)) + (Math.pow(diffYaxis, 2)));
	}
	public double distance(Point p) {
		int diffXaxis = (x > p.getX()) ? x-p.getX() : p.getX()-x;
		int diffYaxis = (y > p.getY()) ? y - p.getY(): p.getY()-y;
		return Math.sqrt((Math.pow(diffXaxis, 2)) + (Math.pow(diffYaxis, 2)));
	}
}
