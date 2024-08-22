
package modelo;

public class cliente {
    int id;
    String nom;
    String apell;
    int edad;
    String genero;
    int telef;
    String email;

    public cliente() {
    }

    public cliente(String nom, String apell, int edad, String genero, int telef, String email) {
        this.nom = nom;
        this.apell = apell;
        this.edad = edad;
        this.genero = genero;
        this.telef = telef;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTelef() {
        return telef;
    }

    public void setTelef(int telef) {
        this.telef = telef;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
