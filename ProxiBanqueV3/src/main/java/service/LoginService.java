package service;

import dao.LoginDAO;


import domaine.Conseiller;
import domaine.Login;

/**
 * @author Stagiaire
 *
 */
public class LoginService {

	// La classe LoginService permet de faire le lien entre la couche pr�sentation
	// et la classe LoginDAO

	// D�claration
	LoginDAO loginDAO = new LoginDAO();

	/**
	 * @param login
	 * @return
	 */
	public Conseiller verifLogin(Login login) {
		return loginDAO.VerificationLogin(login);
	}
}
