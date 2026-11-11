public class Practice1 {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        MyThread thread1=new MyThread();
        MyThread thread2=new MyThread();
        thread.setName("JAVA");
        thread1.setName("Python");
        thread2.setName("JavaScript");
        thread.start();
        thread1.start();
        thread2.start();
    }
}

 class  MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<=4;i++)
        {
            System.out.println(currentThread().getName());
        }
        System.out.println("Thread Completed");
    }
}
