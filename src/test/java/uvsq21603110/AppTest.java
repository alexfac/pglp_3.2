package uvsq21603110;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
}
