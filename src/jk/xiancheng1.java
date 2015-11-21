package jk;

/**
 * Created by Administrator on 2015/11/21.
 */
public class xiancheng1 extends Thread {
    private int a;
    //重写run()方法，run()方法的方法体就是线程执行体
    public void run()
    {
        for(;a<100;a++){
            //当线程继承Thread类时，直接使用this即可获取当前线程
            //Thread对象的getName()方法返回当前线程的名字
            System.out.println(getName()+""+a);
        }
    }
    public static void main(String[]args) {
        for (int a = 0; a < 100; a++) {
            //调用Thread的currentThread()方法获取当前线程
            System.out.println(Thread.currentThread().getName() + "" + a);
            if (a == 20) {
                //创建并启动第一个线程
                new xiancheng1().start();
                //创建并启动第二个线程
                new xiancheng1().start();

            }
        }
    }
}

