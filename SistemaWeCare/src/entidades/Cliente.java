package entidades;

public class Cliente {
    
    // Atributos
    private int clienteID;
    private int tipoclienteID;
    private int wecareID;
    private String nombreCliente;
    private String apellidoCliente;
    private int edad;
    private int sexo;
    private String domicilio;
    private String telefonConvencional;
    private String telefonoCelular;
    private String correo;
    private String cedula;
    private int estado;
    
    
    // Constructores
    public Cliente() {
    }

    public Cliente(int clienteID, int tipoclienteID, int wecareID, String nombreCliente, String apellidoCliente, int edad, int sexo, String domicilio, String telefonConvencional, String telefonoCelular, String correo, String cedula, int estado) {
        this.clienteID = clienteID;
        this.tipoclienteID = tipoclienteID;
        this.wecareID = wecareID;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.edad = edad;
        this.sexo = sexo;
        this.domicilio = domicilio;
        this.telefonConvencional = telefonConvencional;
        this.telefonoCelular = telefonoCelular;
        this.correo = correo;
        this.cedula = cedula;
        this.estado = estado;
    }
    
    
    // Metodos especificos de los atributos

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public int getTipoclienteID() {
        return tipoclienteID;
    }

    public void setTipoclienteID(int tipoclienteID) {
        this.tipoclienteID = tipoclienteID;
    }

    public int getWecareID() {
        return wecareID;
    }

    public void setWecareID(int wecareID) {
        this.wecareID = wecareID;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefonConvencional() {
        return telefonConvencional;
    }

    public void setTelefonConvencional(String telefonConvencional) {
        this.telefonConvencional = telefonConvencional;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
