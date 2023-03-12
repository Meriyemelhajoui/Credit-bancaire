package com.Metier;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BanqueClassTest {
    private BanqueInterface metier;
    @Before
    public void setUp() throws Exception {
        metier=new BanqueClass();
    }

    @Test
    public void calculerMensualiteBanque() {
        double capital = 200000;
        int duree=240;
        double taux=4.5;
        double ResultatAttendu=1265.2987;
        double Resultat= metier.CalculerMensualiteBanque(capital,taux,duree);
        // dans un test unitaire , on compare le resultat attendu avec le resultat de test avec un % de precision

        assertEquals(ResultatAttendu,Resultat,0.0001);
    }
}