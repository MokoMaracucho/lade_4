package oc_lade.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class InscriptionForm {
	
	@NotNull(message="Veuillez saisir un prénom.")
    @Min(value = 1, message = "Veuillez saisir un prénom valide.")
    @Max(value = 30, message = "Veuillez saisir un prénom valide.")
    private String prenomNouvelUtilisateur;
	
	@NotNull(message="Veuillez saisir un nom.")
    @Min(value = 1, message = "Veuillez saisir un nom valide.")
    @Max(value = 30, message = "Veuillez saisir un nom valide.")
    private String nomNouvelUtilisateur;
	
	@NotNull(message="Veuillez saisir un email.")
    @Email(message="Veuillez saisir un email valide.")
    private String emailNouvelUtilisateur;
	
	@NotNull(message="Veuillez saisir un mot-de-passe.")
//	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
	private String motDePasseNouvelUtilisateur;
	
	@NotNull(message="Veuillez confirmer le mot-de-passe.")
    private String confirmationMotDePasseNouvelUtilisateur;
    
	public String getPrenomNouvelUtilisateur() {
		return prenomNouvelUtilisateur;
	}
	
	public void setPrenomNouvelUtilisateur(String prenomNouvelUtilisateur) {
		this.prenomNouvelUtilisateur = prenomNouvelUtilisateur;
	}
	
	public String getNomNouvelUtilisateur() {
		return nomNouvelUtilisateur;
	}
	
	public void setNomNouvelUtilisateur(String nomNouvelUtilisateur) {
		this.nomNouvelUtilisateur = nomNouvelUtilisateur;
	}
	
	public String getEmailNouvelUtilisateur() {
		return emailNouvelUtilisateur;
	}
	
	public void setEmailNouvelUtilisateur(String emailNouvelUtilisateur) {
		this.emailNouvelUtilisateur = emailNouvelUtilisateur;
	}
	
	public String getMotDePasseNouvelUtilisateur() {
		return motDePasseNouvelUtilisateur;
	}
	
	public void setMotDePasseNouvelUtilisateur(String motDePasseNouvelUtilisateur) {
		this.motDePasseNouvelUtilisateur = motDePasseNouvelUtilisateur;
	}

	public String getConfirmationMotDePasseNouvelUtilisateur() {
		return confirmationMotDePasseNouvelUtilisateur;
	}

	public void setConfirmationMotDePasseNouvelUtilisateur(String confirmationMotDePasseNouvelUtilisateur) {
		this.confirmationMotDePasseNouvelUtilisateur = confirmationMotDePasseNouvelUtilisateur;
	}
}
