package modelo;


public class cosmetologo {
    int id_cosmetolo;
    String nom_cosmetolo;
    String apell_cosmetolo;
    int telef_cosmetolo;
    String especi_cosmetolo;

    public cosmetologo() {
    }

    public cosmetologo(String nom_cosmetolo, String apell_cosmetolo, int telef_cosmetolo, String especi_cosmetolo) {
        this.nom_cosmetolo = nom_cosmetolo;
        this.apell_cosmetolo = apell_cosmetolo;
        this.telef_cosmetolo = telef_cosmetolo;
        this.especi_cosmetolo = especi_cosmetolo;
    }

    public int getId_cosmetolo() {
        return id_cosmetolo;
    }

    public void setId_cosmetolo(int id_cosmetolo) {
        this.id_cosmetolo = id_cosmetolo;
    }

    public String getNom_cosmetolo() {
        return nom_cosmetolo;
    }

    public void setNom_cosmetolo(String nom_cosmetolo) {
        this.nom_cosmetolo = nom_cosmetolo;
    }

    public String getApell_cosmetolo() {
        return apell_cosmetolo;
    }

    public void setApell_cosmetolo(String apell_cosmetolo) {
        this.apell_cosmetolo = apell_cosmetolo;
    }

    public int getTelef_cosmetolo() {
        return telef_cosmetolo;
    }

    public void setTelef_cosmetolo(int telef_cosmetolo) {
        this.telef_cosmetolo = telef_cosmetolo;
    }

    public String getEspeci_cosmetolo() {
        return especi_cosmetolo;
    }

    public void setEspeci_cosmetolo(String especi_cosmetolo) {
        this.especi_cosmetolo = especi_cosmetolo;
    }
    
}
