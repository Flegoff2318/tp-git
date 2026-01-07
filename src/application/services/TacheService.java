package application.services;

import application.domaine.Etat;
import application.domaine.Tache;
import application.repositories.TacheRepository;

import java.util.List;

public class TacheService {

	private int compteurId = 11;
	private final TacheRepository tacheRepository;
	private List<Tache> listeTaches;

	public TacheService() {
		tacheRepository = new TacheRepository();
	}

	public int getCompteurId() {
		return compteurId;
	}

	public TacheRepository getTacheRepository() {
		return tacheRepository;
	}

	public void creer(String titre, String description){

		Tache nouvTache = new Tache(compteurId + 1, titre, Etat.NON_ASSIGNEE, null);
		listeTaches.add(nouvTache);
		IO.println(description);
		compteurId += 1;

	}

	public void rechercherParUtilisateur(String idUtilisateur){

		listeTaches.stream()
				.filter(tache -> tache.getIdUtilisateurAssigne().equalsIgnoreCase(idUtilisateur))
				.forEach(IO::println);

	}


	public void assignerTache(int identifiantTache, String identifiantUtilisateur){
		Tache tache = tacheRepository.getTaches().stream()
				.filter(t -> t.getId()==identifiantTache)
				.findFirst()
				.orElseThrow(()->new RuntimeException("Tache inexistante."));
		tache.setIdUtilisateurAssigne(identifiantUtilisateur);
		tache.setEtat(Etat.EN_COURS);
		// tacheRepository.save(tache);
	}
}
