package entidades;

public class WeCare {
    
    // Atributos
    private int wecareID;
    private String nombreNegocio;
    private String fechaFundacion;
    private String correo;
    private String telefono;
    private String correoOwner;
    private String telefonoOwner;

    
    // Constructores
    public WeCare() {
    }

    public WeCare(int wecareID, String nombreNegocio, String fechaFundacion, String correo, String telefono, String correoOwner, String telefonoOwner) {
        this.wecareID = wecareID;
        this.nombreNegocio = nombreNegocio;
        this.fechaFundacion = fechaFundacion;
        this.correo = correo;
        this.telefono = telefono;
        this.correoOwner = correoOwner;
        this.telefonoOwner = telefonoOwner;
    }

    
    // Metodos especificos de los atributos
    public int getWecareID() {
        return wecareID;
    }

    public void setWecareID(int wecareID) {
        this.wecareID = wecareID;
    }

    public String getNombreNegocio() {
        return nombreNegocio;
    }

    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoOwner() {
        return correoOwner;
    }

    public void setCorreoOwner(String correoOwner) {
        this.correoOwner = correoOwner;
    }

    public String getTelefonoOwner() {
        return telefonoOwner;
    }

    public void setTelefonoOwner(String telefonoOwner) {
        this.telefonoOwner = telefonoOwner;
    }
}
