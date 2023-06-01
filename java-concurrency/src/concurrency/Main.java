package concurrency;
public class Main {
    public static void main(String[] args) {
        DeadlockUsingSync obj = new DeadlockUsingSync();

        // Thread 1
        new Thread(() -> {
            obj.methodA();
        }).start();

        // Thread 2
        new Thread(() -> {
            obj.methodB();
        }).start();
    }
}
