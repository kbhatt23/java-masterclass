package nestedclasses.innerclasses;

public class SingletonBillPugh {
	//eager , even when the class is not neede it gets created
	//private static SingletonBillPugh instance = new SingletonBillPugh();
	//lazy loading happens as static inner class do not gets loaded at class loading
	private SingletonBillPugh() {
	}
	//static class is needed, as static class can enable lazy lading here, only outer class loads
	//hence object will be created only when needed
	private static  class SingletonBillPughFactory{
		private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
	}
	
	public static SingletonBillPugh create() {
		//outer class can access inner class method, if inner class , lets creat eobject
			//otherwise we need to create static inner class
		return SingletonBillPughFactory.INSTANCE;
	}
}
