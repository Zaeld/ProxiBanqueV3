package service;

import java.util.ArrayList;


import java.util.List;

import dao.CompteCourantDAO;
import dao.CompteEpargneDAO;
import domaine.CompteBancaire;

/**
 * @author Stagiaire
 *
 */
public class GestionCompteService {
	CompteCourantDAO courantDAO = new CompteCourantDAO();
	CompteEpargneDAO epargneDAO = new CompteEpargneDAO();

	public List<CompteBancaire> getAllCompte() {

		// D�claration
		List<CompteBancaire> listCompte = new ArrayList<CompteBancaire>();
		ArrayList<CompteBancaire> comptes = new ArrayList<CompteBancaire>();

		// On ajoute la liste des comptes �pargnes et courant � la liste de compte
		// bancaire
		listCompte.addAll(courantDAO.getAllCourant());
		listCompte.addAll(epargneDAO.getAllEpargne());
		for(CompteBancaire compte : listCompte){
			if (compte!=null)
			comptes.add(compte);	
	}
		return comptes;

}
}