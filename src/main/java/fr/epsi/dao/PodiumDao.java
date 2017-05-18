package main.java.fr.epsi.dao;

public interface PodiumDao {

	/**
	 * Permet de creer un podium avec les differents intitules
	 * @param noms les intitules 
	 */
	public void creerPodium(String[] noms);
	
	/**
	 * Permet de supprimer un podium grace a son id
	 * @param id l'id du podium a supprimer
	 */
	public void supprimerPodium(Long id);
	
	
	public void voter 
}
