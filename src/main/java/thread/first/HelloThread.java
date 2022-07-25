package thread.first;

public class HelloThread extends Thread {
    public void run() {
        System.out.println("hello from thred");
    }

    public static void main(String[] args) {
        new HelloThread().start();
    }
}
