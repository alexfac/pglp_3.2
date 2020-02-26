package uvsq21603110;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void createEmploye(){
        CalculSalaire e = new CalculSalaire("Bob","2 rue");
        assertTrue(e.CalculSalaire() == 1500);
    }
}
