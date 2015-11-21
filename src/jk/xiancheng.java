package jk;

/**
 * Created by Administrator on 2015/11/21.
 */
public class xiancheng implements Runnable   {
    private int i;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                xiancheng st = new xiancheng();
                new Thread(st, "子线程1").start();
                new Thread(st, "子线程2").start();
            }
        }
    }

}
