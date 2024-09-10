
package modelo;

public class cliente {
    private int id_cliente;
    private String nom_cliente;
    private String apell_cliente;
    private int document_cliente;
    private String email_cliente;
    private String genero_cliente;
    private String tipo_cliente;
    private long telef_cliente;
    private String contrasena;
    private boolean Estado;
    private Rol Rol; 
    public cliente(int id_cliente,String nom_cliente, String apell_cliente, int document_cliente, String email_cliente, String genero_cliente, String tipo_cliente, long telef_cliente, String contrasena, boolean Estado, Rol Rol) {
        this.id_cliente = id_cliente;
        this.nom_cliente = nom_cliente;
        this.apell_cliente = apell_cliente;
        this.document_cliente = document_cliente;
        this.email_cliente = email_cliente;
        this.genero_cliente = genero_cliente;
        this.tipo_cliente = tipo_cliente;
        this.telef_cliente = telef_cliente;
        this.contrasena = contrasena;
        this.Estado = Estado;
        this.Rol = Rol;
    }

    public cliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    public String getApell_cliente() {
        return apell_cliente;
    }

    public void setApell_cliente(String apell_cliente) {
        this.apell_cliente = apell_cliente;
    }

    public int getDocument_cliente() {
        return document_cliente;
    }

    public void setDocument_cliente(int document_cliente) {
        this.document_cliente = document_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getGenero_cliente() {
        return genero_cliente;
    }

    public void setGenero_cliente(String genero_cliente) {
        this.genero_cliente = genero_cliente;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public long getTelef_cliente() {
        return telef_cliente;
    }

    public void setTelef_cliente(long telef_cliente) {
        this.telef_cliente = telef_cliente;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public Rol getRol() {
        return Rol;
    }

    public void setRol(Rol Rol) {
        this.Rol = Rol;
    }
    
    
}
