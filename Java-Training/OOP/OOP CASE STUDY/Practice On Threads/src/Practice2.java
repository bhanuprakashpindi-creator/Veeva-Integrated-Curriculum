import com.sun.jdi.ThreadReference;

public class Practice2 {

    public static void main(String[] args) throws InterruptedException {
        SumTask task=new SumTask();
        Thread t1=new Thread(task);
        t1.start();
        t1.join();
        System.out.println("Sum ="+ task.sum);
        System.out.println("Main Thread Completed..");

    }
}
class SumTask implements  Runnable
{
    int sum=0;
    public void run()
    {
        System.out.println("The Calculation Started..");
        for(int i=1;i<=100;i++)
        {
            sum+=i;
        }
    }
}
