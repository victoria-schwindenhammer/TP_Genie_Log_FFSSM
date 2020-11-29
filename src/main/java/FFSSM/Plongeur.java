package FFSSM;

import java.time.LocalDate;
import java.util.HashSet;

public class Plongeur extends Personne {
     public int niveau;
     public HashSet<Licence> licences;

    public Plongeur(int niveau, String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.niveau = niveau;
    }  

    public int getNiveau() {
        return niveau;
    }
    public void setNiveau(int niveau) {
        this.niveau=niveau;
    }
    
    public void ajouteLicence(Licence L ) {
         licences.add(L); 
    }
}
