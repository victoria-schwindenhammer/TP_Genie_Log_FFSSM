/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FFSSM;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author victoria
 */
public class FFSSMTest {
    
    Licence L1;
    Club C1;
    Moniteur M1;
    Moniteur M2;
    Plongeur P1;
    Plongeur P2;
    Plongee Plong1;
    Plongee Plong2;
    Site S1;
    Site S2;
    
    @BeforeEach
    public void setUp() {
        C1 = new Club(M1, "Bikinibottom", "0345676473");
        L1 = new Licence(P1, "001", (2020-01-01), 2, C1);
        Plong1 = new Plongee(S1, M2, (2020-04-26), 300, 180);
        Plong2 = new Plongee(S2, M1, (2020-07-19), 500, 180);
    }
    
     @Test
    public void testPlongeesNonConformes() {
        
    }
    
    @Test
    public void testOrganisePlongee() {
        //On ajoute 1 plongée à la liste des plongées organisées
        C1.organisePlongee(Plong1);
        assertEquals((Plong1), C1.plongeesOrganisees, "La liste des plongées organisées devrait contenir la plongée Plong1");
        
        //On ajoute une deuxième plongée à la liste
        C1.organisePlongee(Plong2);
        HashSet<Plongee> plongeeattendu = new HashSet<>();
        plongeeattendu.add(Plong1);
        plongeeattendu.add(Plong2);
        assertEquals( plongeeattendu , C1.plongeesOrganisees, "La liste des plongées organisées devrait contenir les plongées Plong1 et Plong2");
        
    }
    
    @Test
    public void testTerminer() {
       
    }
    
     @Test
    public void testEstTerminee() {
        
    }
    
    @Test
    public void testEstValide() {
        //On test si la licence L1 est valide à une date ou elle devrait l'être
        assertTrue(L1.estValide(LocalDate.of( 2020 , 07 , 24)),"La licence devrait être valide");
        //On test si la licence L1 est valide à une date où elle de ne doit pas l'être
        assertFalse(L1.estValide(LocalDate.of(2021,12,24)),"La licence ne devrait plus être valide");
    }
    
    @Test
    public void testEmployeurActuel() {
        
    }
    
    @Test
    public void testNouvelleEmbauche() {
        
    }
    
    @Test
    public void testEmplois() {
        
    }
    
    @Test
    public void testAjouteParticipant() {
        Plong1.ajouteParticipant(P1);
        assertEquals((P1),Plong1.participants, "La liste des participants devrait contenir le plongeur P1");
        Plong1.ajouteParticipant(P2);
        HashSet<Plongeur> participantsattendus = new HashSet<>();
        participantsattendus.add(P1);
        participantsattendus.add(P2);
        assertEquals(participantsattendus, Plong1.participants, "La liste des participants devrait contenir les plongeurs P1 et P2");
        
        
    }
    
    @Test
    public void testEstConforme() {
        
    }
    
    @Test
    public void testAjouteLicence() {
        
    }
    
}
