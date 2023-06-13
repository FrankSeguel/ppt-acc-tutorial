package cl.acc.tutorial.exception;

/**
 *
 * @author fseguel
 */
public class ErrorTecnicoException extends Exception{
    
    String codigo;
    String descripcion;

    public ErrorTecnicoException() {
    }

    public ErrorTecnicoException(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
