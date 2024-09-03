
package modelo;

public class cliente {
    //int id;
    String nom;
    String apell;
    int document;
    String email;
    String genero;
    String tipo;
    long telef;
    String contrasena;
    public cliente() {
    }

    public cliente( String nom, String apell, int document, String email, String genero, String tipo, long telef, String contrasena) {
        //this.id = id;
        this.nom = nom;
        this.apell = apell;
        this.document = document;
        this.email = email;
        this.genero = genero;
        this.tipo = tipo;
        this.telef = telef;
        this.contrasena = contrasena;
    }

   // public int getId() {
     //   return id;
    //}

    //public void setId(int id) {
    //    this.id = id;
    //}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getTelef() {
        return telef;
    }

    public void setTelef(long telef) {
        this.telef = telef;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
