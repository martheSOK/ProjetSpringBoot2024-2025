package com.IfntiTP.beans;

import java.util.ArrayList;

public class BeanUtilisateur {
	
	private static ArrayList  userInscrit = new ArrayList();
	
	private String nom;
	
    private String password;
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePasse() {
        return password;
    }

    public void setMotDePasse(String motDePasse) {
        this.password = motDePasse;
    }
 

	public static ArrayList getUserInscrit() {
		return userInscrit;
	}

	public static void setUserInscrit(ArrayList userInscrit) {
		BeanUtilisateur.userInscrit = userInscrit;
	}

	
	public void add_user(BeanUtilisateur user) {
		userInscrit.add(user);
		
	}
}








    
    
 


