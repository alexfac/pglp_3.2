package uvsq21603110;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

public class AppTest 
{
    @Test
    public void createEmploye(){
        Employe e = new Employe("Bob","2 rue", 2);
        assertTrue(e != null);
    }

    @Test
    public void verifsalaireEmploye(){
        Employe e = new Employe("Bob","2 rue", 2);
        assertTrue(e.CalculSalaire() == 1540);
    }

    @Test
    public void createVendeur(){
        Vendeur v = new Vendeur("Charlie","2 rue", 200);
        assertTrue(v != null);
    }

    @Test
    public void verifsalaireVendeur(){
        Vendeur v = new Vendeur("Bob","2 rue", 200);
        assertTrue(v.CalculSalaire() == 1700);
    }

    @Test
    public void createManager(){
        Employe e = new Employe("Bob","2 rue", 2);
        ArrayList E = new ArrayList<Employe>();
        E.add(e);
        Manager m = new Manager("Charlie","2 rue", E);
        assertTrue(m != null);
    }

    @Test
    public void verifsalaireManager(){
        Employe e = new Employe("Bob","2 rue", 2);
        ArrayList E = new ArrayList<Employe>();
        E.add(e);
        Manager m = new Manager("Bob","2 rue", E);
        assertTrue(m.CalculSalaire() == 1600);
    }
}
