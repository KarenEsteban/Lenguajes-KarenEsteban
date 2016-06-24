package genericos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProbarGuardado {
    public static void main(String[] args) {
    Usuario u=new Usuario("Juan", 20, "juan@gmail.com");
    PersistenciaUsuario p=new PersistenciaUsuario();
        try { 
            p.guardar(u);
            System.out.println("Usuario guardado");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
