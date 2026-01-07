package application.services;

import application.domaine.Etat;
import application.domaine.Utilisateur;
import application.repositories.UtilisateurRepository;

import java.util.List;
import java.util.stream.Collectors;

public class UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;
    private final TacheService tacheService;
    private List<Utilisateur> listeUtilisateurs;

    public UtilisateurService() {
        utilisateurRepository = new UtilisateurRepository();
        tacheService = new TacheService();
    }

    public void rechercherParId(String idUser) {

        listeUtilisateurs.stream()
                .filter(user -> user.getIdentifiant().equals(idUser))
                .forEach(IO::println);

    }

    public Utilisateur creerUtilisateur(String prenom, String nom) {
        String identifiantUtilisateur = prenom.charAt(0) + nom;
        Utilisateur nouvelUtilisateur = new Utilisateur(identifiantUtilisateur, nom, prenom, "");
        utilisateurRepository.getUtilisateurs().add(nouvelUtilisateur);
        return nouvelUtilisateur;
    }

    public List<Utilisateur> rechercherTous() {
        return utilisateurRepository.getUtilisateurs();
    }

	public void modifierCourriel(String idUser, String adresseMail){

		listeUtilisateurs.stream()
				.filter(user -> user.getIdentifiant().equalsIgnoreCase(idUser))
				.forEach(s -> s.setCourriel(adresseMail));

	}


    public Utilisateur supprimerUtilisateur(String identifiantUtilisateur) {
        Utilisateur utilisateurASupprimer = utilisateurRepository.getUtilisateurs().stream()
                .filter(utilisateur -> utilisateur.getIdentifiant().equals(identifiantUtilisateur))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Utilisateur non existant."));
        utilisateurRepository.getUtilisateurs().remove(utilisateurASupprimer);
        // Passage des tâches de l'utilisateur "en cours" à "non assignee"
        tacheService.getTacheRepository().getTaches().stream()
                .filter(tache -> tache.getIdUtilisateurAssigne().equals(identifiantUtilisateur))
                .forEach(tache -> {
                    tache.setIdUtilisateurAssigne(identifiantUtilisateur);
                    tache.setEtat(Etat.NON_ASSIGNEE);
                });
        return utilisateurASupprimer;
    }
}
