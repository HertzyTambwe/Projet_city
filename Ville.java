/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 * @author ___Ana5___
 */
public class Ville {
    private String nomVille;
    private String nomPays;
    private int nbreHabitants;
    
//    CONSTRUCTEUR
    
    public Ville(){
        System.out.println("Creeations d'une ville sans parametre");
        nomVille = "Inconnue";
        nomPays = "Inconnue";
        nbreHabitants = 0;
        
    }
    public Ville(String nVille, int nbreH, String nPays){
        System.out.println("Creations d'une ville avec parametre");
        this.nomVille = nVille;
        this.nbreHabitants = nbreH;
        this.nomPays = nPays;
    }
//    ************** GETTERS ***************
    
    public String getNomVille(){
        return this.nomVille;
    }
    public String getNomPays(){
        return this.nomPays;
    }
    public int getNombreH(){
        return this.nbreHabitants;
    }
//    ***************** SETTERS ***************
    
    public void setNomVille(String nVille){
        this.nomVille = nVille;
    }
    public void setNomPays(String nPays){
        this.nomPays = nPays;
    }
    public void setNbreH(int nbreH){
        this.nbreHabitants = nbreH;
    }
}
