package uvsq21603110;

import java.util.ArrayList;

public class Manager extends AbstractEmploye{
    private String nom;
    private String addresse;
    private ArrayList E;

    public Manager(String nom, String adresse, ArrayList E){
        this.nom = nom;
        this.addresse = adresse;
        this.E = E;
    }

    @Override
    public double CalculSalaire(){
        return 1500 + 100*this.E.size();
    }
}
