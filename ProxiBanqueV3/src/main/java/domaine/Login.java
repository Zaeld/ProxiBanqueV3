package domaine;

/**
 * @author Stagiaire
 *
 */
public class Login {

	// Declaration des attributs caracterisant un objet de type Login

	private String identifiant;
	private String motDePasse;
	// Constructeur parametre

	public Login() {
		this.identifiant = "Entrez votre login";
		this.motDePasse = "Entrez votre mot de passe";

	}
	// Getters et Setters

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String login) {
		this.identifiant = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

}
