package uvsq21603110;

public class AfficheEmploye extends Employe{

    public AfficheEmploye(String nom, String adresse) {
        super(nom, adresse);
    }

    void affiche_Coordonnees() {
        System.out.println(nom + ", " + adresse);
    }
}
