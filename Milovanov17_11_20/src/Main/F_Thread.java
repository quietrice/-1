package Main;

public class FThread extends Thread{
    public void run() {
        while (true) {
            int i = 0;
            try {
                gg();
                System.out.println(this.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
            if (i > 20) {
                break;
            }
        }
    }
}

