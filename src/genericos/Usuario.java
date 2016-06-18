
package genericos;

import java.io.Serializable;

    /*
    PROBLEMA
    -GENERAR UN SISTEMA QUE TE PERMITA PERSISTIR(GUARDAR) ENTIDADES DE TIPO
    USUARIO USANDO SOLAMENTE JAVA.
    
    NOTA: NO USAR ARCHIVOS DE TEXTO NI WORD, NI NADA DE ESAS COSAS RARAS
    DEBES USAR TU PROPIA TECNOLOGIA
    */
public class Usuario implements Serializable{
   
    //1. ENCAPSULAMIENTO(Atributos privados y metodos get y set por cada atributos )
    //2. AGREGAR CONSTRUCTOR DE DEFECTO Y CONSTRUCTORES QUE INICIALIZA LOS ATRIBUTOS
    //3. SOBREESCRIBIR EL METODO toString()
    
    private String nombre;
    private Integer edad;
    private String email;

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", email=" + email + '}';
    }

    public Usuario(String nombre, Integer edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public Usuario() {
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
       
}
