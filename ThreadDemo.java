class MyThread extends Thread {

    public void run() {

        for(int count = 1; count <= 5; count++) {
            System.out.println(
                    Thread.currentThread().getName()
                            + " : " + count);
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        MyThread firstThread = new MyThread();
        MyThread secondThread = new MyThread();

        firstThread.start();
        secondThread.start();
    }
}
