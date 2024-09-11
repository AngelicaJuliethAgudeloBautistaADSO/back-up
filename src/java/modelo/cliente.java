
package modelo;

public class cliente {
    private int id_cliente;
    private String nom_cliente;
    private String apell_cliente;
    private String tipo_cliente;
    private int document_cliente;
    private String genero_cliente;
    private String telef_cliente;
    private String email_cliente;
    private String contrasena;
    private int rol_fk;

    // Constructor por defecto
    public cliente() {}

    // Constructor parametrizado
    public cliente(int id_cliente, String nom_cliente, String apell_cliente, String tipo_cliente, 
                    int document_cliente, String genero_cliente, String telef_cliente, 
                    String email_cliente, String contrasena, int rol_fk) {
        this.id_cliente = id_cliente;
        this.nom_cliente = nom_cliente;
        this.apell_cliente = apell_cliente;
        this.tipo_cliente = tipo_cliente;
        this.document_cliente = document_cliente;
        this.genero_cliente = genero_cliente;
        this.telef_cliente = telef_cliente;
        this.email_cliente = email_cliente;
        this.contrasena = contrasena;
        this.rol_fk = rol_fk;
    }

    // Getters y Setters
    public int getId_cliente() { return id_cliente; }
    public void setId_cliente(int id_cliente) { this.id_cliente = id_cliente; }
    
    public String getNom_cliente() { return nom_cliente; }
    public void setNom_cliente(String nom_cliente) { this.nom_cliente = nom_cliente; }
    
    public String getApell_cliente() { return apell_cliente; }
    public void setApell_cliente(String apell_cliente) { this.apell_cliente = apell_cliente; }

    public String getTipo_cliente() { return tipo_cliente; }
    public void setTipo_cliente(String tipo_cliente) { this.tipo_cliente = tipo_cliente; }

    public int getDocument_cliente() { return document_cliente; }
    public void setDocument_cliente(int document_cliente) { this.document_cliente = document_cliente; }

    public String getGenero_cliente() { return genero_cliente; }
    public void setGenero_cliente(String genero_cliente) { this.genero_cliente = genero_cliente; }

    public String getTelef_cliente() { return telef_cliente; }
    public void setTelef_cliente(String telef_cliente) { this.telef_cliente = telef_cliente; }

    public String getEmail_cliente() { return email_cliente; }
    public void setEmail_cliente(String email_cliente) { this.email_cliente = email_cliente; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public int getRol_fk() { return rol_fk; }
    public void setRol_fk(int rol_fk) { this.rol_fk = rol_fk; }
}

