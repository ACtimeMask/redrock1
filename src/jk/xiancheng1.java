package jk;

/**
 * Created by Administrator on 2015/11/21.
 */
public class xiancheng1 extends Thread {
    private int a;
    //��дrun()������run()�����ķ���������߳�ִ����
    public void run()
    {
        for(;a<100;a++){
            //���̼̳߳�Thread��ʱ��ֱ��ʹ��this���ɻ�ȡ��ǰ�߳�
            //Thread�����getName()�������ص�ǰ�̵߳�����
            System.out.println(getName()+""+a);
        }
    }
    public static void main(String[]args) {
        for (int a = 0; a < 100; a++) {
            //����Thread��currentThread()������ȡ��ǰ�߳�
            System.out.println(Thread.currentThread().getName() + "" + a);
            if (a == 20) {
                //������������һ���߳�
                new xiancheng1().start();
                //�����������ڶ����߳�
                new xiancheng1().start();

            }
        }
    }
}

