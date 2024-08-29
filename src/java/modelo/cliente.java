
package modelo;

public class cliente {
private String nom;
    private String apell;
    private String email;
    private String genero;
    private String tipo;
    private int id;
    private int edad;
    private long telef;
    private String contrasena;

    public String getNombre() { return nom; }
    public void setNombre(String nom) { this.nom = nom; }

    public String getApellidos() { return apell; }
    public void setApellidos(String apell) { this.apell = apell; }

    public String getCorreo() { return email; }
    public void setCorreo(String email) { this.email = email; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getDocumento() { return id; }
    public void setDocumento(int id) { this.id = id; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public long getTelefono() { return telef; }
    public void setTelefono(long telef) { this.telef = telef; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
    
}
