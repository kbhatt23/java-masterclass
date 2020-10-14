package basics;

public class HOwManyObjects {
public static void main(String[] args) {
	
	new HOwManyObjects().runTasks();
}

private void runTasks() {
	int i=23;
	//i++;
	SingleAbstractInterface obj = new SingleAbstractInterface() {
		//within method local it works
		//int i=23;
		@Override
		public void task() {
			//i++;
			System.out.println("jai shree ram form class "+getClass().getName() +" with index "+i);
		}
	};
	obj.task();
	//i++;
	
	SingleAbstractInterface obj1 = () -> {
			//i++;
			System.out.println("jai shree ram from class "+getClass().getName() +" with index "+i);
		};
	obj1.task();
}
}

