package thread;


public class TercerThread {
    public static void main(String[] args) {
        
        Thread t1=new Thread(new Runnable(){
            //Clase interna anonima
            public void run(){ 
                System.out.println("Soy el primer thread");
            }
        });
        
        Thread t2=new Thread(new Runnable(){
            public void run(){
                System.out.println("Soy el segundo thread");
            }
        });
        
        t1.start();
        t2.start();
        
    }
    
}
