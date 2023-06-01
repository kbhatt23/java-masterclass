package concurrency;
public class MyClass {
    public synchronized void methodA() {
        System.out.println("Inside methodA");
        methodB();
    }

    public synchronized void methodB() {
        System.out.println("Inside methodB");
    }
}

