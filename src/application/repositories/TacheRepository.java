package application.repositories;

import application.domaine.Etat;
import application.domaine.Tache;

import java.util.ArrayList;
import java.util.List;

public class TacheRepository {
	List<Tache> taches = new ArrayList<>();

	public TacheRepository() {
		taches.add(new Tache(1, "Créer le projet", Etat.TERMINEE, "jdupont"));
		taches.add(new Tache(2, "Configurer la base de données", Etat.EN_COURS, "jdupont"));
		taches.add(new Tache(3, "Rédiger la documentation", Etat.NON_ASSIGNEE, null));
		taches.add(new Tache(4, "Implémenter l'authentification", Etat.EN_COURS, "tmartin"));
		taches.add(new Tache(5, "Gestion des utilisateurs", Etat.NON_ASSIGNEE, null));
		taches.add(new Tache(6, "Tests unitaires", Etat.NON_ASSIGNEE, null));
		taches.add(new Tache(7, "Création de l'interface utilisateur", Etat.EN_COURS, "srobert"));
		taches.add(new Tache(8, "Correction des bugs", Etat.NON_ASSIGNEE, null));
		taches.add(new Tache(9, "Optimisation des performances", Etat.NON_ASSIGNEE, null));
		taches.add(new Tache(10, "Déploiement en production", Etat.NON_ASSIGNEE, null));
	}
}
