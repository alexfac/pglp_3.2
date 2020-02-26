package uvsq21603110;

public class Employe extends AbstractEmploye {

    private String nom;
    private String addresse;
    private int anciennete;

    public Employe(String nom, String adresse, int anciennete){
        this.nom = nom;
        this.addresse = adresse;
        this.anciennete = anciennete;
    }

    @Override
    public double CalculSalaire(){
        return 1500 + 20 * anciennete;
    }
}
