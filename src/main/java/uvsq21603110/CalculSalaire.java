package uvsq21603110;

public class CalculSalaire extends AbstractEmploye{

    public CalculSalaire(String nom, String adresse) {
        super(nom, adresse);
    }

    public double CalculSalaire(){
        return 1500;
    }
}
