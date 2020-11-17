package Main;

public class Main {

    public static void main(String[] args) {
        Thread Thread1 = new Thread();
        Thread Thread2 = new Thread();
        Thread1.start();
        Thread2.start();
    }

    static synchronized void gg() throws InterruptedException {
        System.out.println("------");
        Thread.sleep(1000);
    }


}