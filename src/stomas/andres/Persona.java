package stomas.andres;

public abstract class Persona {
    private String nombre;
    protected Cedula cedula;
    private int edad;
    private String domicilio;
    private String telefono;
    private String mail;

    public String getDomicilio() {
        return domicilio;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getMail() {
        return mail;
    }
    public String getTelefono() {
        return telefono;
    }
    public Cedula getCedula() {
        return cedula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public void setCedula(Cedula cedula) {
        this.cedula = cedula;
    }
}
