package excepciones;

public class ValidarArchivo {
 public static void validarExtencion(String extencion)throws ArchivoNoTxtException{
     if (!extencion.equals("txt")) throw new ArchivoNoTxtException();
 }
         
}
