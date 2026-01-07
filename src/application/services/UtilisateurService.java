package application.services;

import application.domaine.Utilisateur;
import application.repositories.UtilisateurRepository;

public class UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurService() {
        utilisateurRepository = new UtilisateurRepository();
    }

    public Utilisateur creerUtilisateur(String prenom, String nom) {
        String identifiantUtilisateur = prenom.charAt(0) + nom;
        Utilisateur nouvelUtilisateur = new Utilisateur(identifiantUtilisateur, nom, prenom, "");
        utilisateurRepository.getUtilisateurs().add(nouvelUtilisateur);
        return nouvelUtilisateur;
    }
}
