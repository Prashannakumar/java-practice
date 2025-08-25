import java.util.Date;

public class SleepDemo {
    public static void main(String[] args){
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");

            Thread.sleep(4000);
            System.out.println(new Date() + "\n");

            long end = System.currentTimeMillis();
            long diff = end -start;
            System.out.print("Difference is "+ diff);
        } catch (Exception e){
            System.out.print("Got an exception!");
        }
    }
}