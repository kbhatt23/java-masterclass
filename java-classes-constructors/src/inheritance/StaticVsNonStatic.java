package inheritance;

public class StaticVsNonStatic {

	private static int count = 0;
	private int instanceCount = 0;
	
	public void updateStaticCount() {
		count++;
	}
	public int getStaticCount() {
		return count;
	}
	
	public void updateInstanceCount() {
		instanceCount++;
	}
	public int getInstanceCount() {
		return instanceCount;
	}
	
	public static void main(String[] args) {
		StaticVsNonStatic obj1 = new StaticVsNonStatic();
		StaticVsNonStatic obj2 = new StaticVsNonStatic();
		obj1.updateStaticCount();
		obj1.updateStaticCount();
		obj1.updateStaticCount();
		obj1.updateStaticCount();
		
		obj2.updateInstanceCount();
		obj2.updateInstanceCount();
		obj1.updateInstanceCount();
		
		System.out.println(obj1.getInstanceCount());
		System.out.println(obj1.getStaticCount());
		System.out.println(obj2.getInstanceCount());
		System.out.println(obj2.getStaticCount());
	}
}
