package _static;

public class DatabaseEntity {
	//one copy all across
	private static int count=0;
	//a primary key should never change -> good use case of final keyword
	//also it will change everytime -> we must use autogenerated key value
	private final int primaryKey;
	public int getPrimaryKey() {
		return primaryKey;
	}
	//can not have setter at all
	//public void setKey(int val) {
		//this.primaryKey = val;
	//}

	public DatabaseEntity() {
		this.primaryKey = ++count;
	}
	

	public static void main(String[] args) {
		DatabaseEntity entity1 = new DatabaseEntity();
		DatabaseEntity entity2 = new DatabaseEntity();
		DatabaseEntity entity3 = new DatabaseEntity();
		DatabaseEntity entity4 = new DatabaseEntity();
		System.out.println(entity1.getPrimaryKey());		System.out.println(entity2.getPrimaryKey());		System.out.println(entity3.getPrimaryKey());		System.out.println(entity4.getPrimaryKey());
	}
}
