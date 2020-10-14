package basics;

public class PurposeOfLambdas {
public static void main(String[] args) {
	System.out.println("Things started by "+Thread.currentThread().getName());
	
	new Thread(new TaskRunner()).start();
	
	//good practise to make a variable final whihc goes inside lambda/ananmyous class
	//anyway once defined if we modify it will give compilation error insise lambda
		/* final */int nakleeCount=23;
	
	//it has to be effectively finla forcefully
	//meaning we cna not modify after decalring anything which goes inside lambda/ananymous class
	//nakleeCount++;
	//using annoymous inner class
	new Thread(new Runnable() {
		@Override
		public void run() {
			System.out.println("task executed using anonymous inner class by "+Thread.currentThread().getName()+ " with count "+nakleeCount);
			//effectively final can not increment or modify within anonumous class
           //nakleeCount++;
		}
	}).start();
	
	//using method local class
	Runnable runnableObj = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("task executed using method local inner class by "+Thread.currentThread().getName()+ " with count "+nakleeCount);	
			//nakleeCount++;
		}
	};
	new Thread(runnableObj).start();
	//lambdas
	new Thread(() -> {
		System.out.println("task executed using lambdas by "+Thread.currentThread().getName()+ " with count "+nakleeCount);
		
		//effective final
		//nakleeCount++;
		}
	).start();
}
}

class TaskRunner implements Runnable{
	
	public void run() {
		System.out.println("task executed using runnable by "+Thread.currentThread().getName());
	}
}
