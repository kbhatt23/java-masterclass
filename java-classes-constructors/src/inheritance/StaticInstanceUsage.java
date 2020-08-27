package inheritance;

public class StaticInstanceUsage {
	private static int count=0;
	public StaticInstanceUsage() {
		this.count++;
	}
	
	public static int totalObjects() {
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("inital objects "+StaticInstanceUsage.totalObjects());
		
		StaticInstanceUsage s = new StaticInstanceUsage();
		StaticInstanceUsage s2 = new StaticInstanceUsage();
		StaticInstanceUsage s3 = new StaticInstanceUsage();
		StaticInstanceUsage s4 = new StaticInstanceUsage();
		System.out.println(StaticInstanceUsage.totalObjects());
		StaticInstanceUsage s42 = new StaticInstanceUsage();
		System.out.println(StaticInstanceUsage.totalObjects());
	} 
	
}
