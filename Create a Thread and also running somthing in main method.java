import java.util.concurrent.TimeUnit;
import java.io.*;


public class lab_05 extends Thread {

    public void run(){
        for (int i = 0; i <= 10; i++){
            System.out.println("Problem_05");
            try {
                TimeUnit.SECONDS.sleep(1);

            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        lab_05 thread = new lab_05();
        thread.run();
        for (int i = 0; i <=10; i++){
            System.out.println(" "+i);
            TimeUnit.SECONDS.sleep(1);
        }
    }

}

