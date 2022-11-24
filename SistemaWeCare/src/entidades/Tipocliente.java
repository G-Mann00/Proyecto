package entidades;

public class Tipocliente {
    
    // Atributos
    private int tipoClienteID;
    private String frecuencia;
    private int estado;

    
    // Constructores
    public Tipocliente() {
    }

    public Tipocliente(int tipoClienteID, String frecuencia, int estado) {
        this.tipoClienteID = tipoClienteID;
        this.frecuencia = frecuencia;
        this.estado = estado;
    }
    
    
    // Metodos especificos de los atributos
    public int getTipoClienteID() {
        return tipoClienteID;
    }

    public void setTipoClienteID(int tipoClienteID) {
        this.tipoClienteID = tipoClienteID;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
