package thread;

public class ProbarThread implements Runnable{
    public static void main(String[] args) {
        //Creamos un Thread
        PrimerThread t1=new PrimerThread();
        t1.start();
        //Creamos el segundo Thread
       // ProbarThread r2=new Runnable(); --> ERROR!! runnable es una interface y no tiene contructores
        Runnable r=new ProbarThread();
        Thread t2=new Thread(r);
        t2.start();
    }
    public void run(){
        System.out.println("Segundo thread");
    }
}
