package uvsq21603110;

public class Vendeur extends AbstractEmploye{

    private String nom;
    private String addresse;
    private int commission;

    public Vendeur(String nom, String adresse, int commission){
        this.nom = nom;
        this.addresse = adresse;
        this.commission = commission;
    }

    @Override
    public double CalculSalaire(){
        return 1500 + commission;
    }
}
