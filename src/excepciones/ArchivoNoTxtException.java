package excepciones;


public class ArchivoNoTxtException extends Exception{
    public ArchivoNoTxtException(){
        super("lo siento, pero solo leo archivos .txt");
       
    }
    
}
