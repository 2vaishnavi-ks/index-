class counter extends Thread
{
     static int count;
     public void run()
     {
           for(int i=0;i<1000;i++)
           {
                count++;
           }
     }
}
class mainCounter
{
         public static void main(String args[])
         {
                   counter t1 =new counter();
                   counter t2 =new counter();
                   
                   t1.start();
                   t2.start();
                   
                   System.out.println("final count is:"+ counter.count);
                   //fgjhorijtihjkfgmghokorthjhmhlmk
         }
}
