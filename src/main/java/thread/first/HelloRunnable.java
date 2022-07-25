package thread.first;

/*
    https://docs.oracle.com/javase/tutorial/essential/concurrency/runthread.html
 */
public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("hello from a thread!");
    }

    public static void main(String[] args) {
        new Thread(new HelloRunnable()).start();
    }
}
