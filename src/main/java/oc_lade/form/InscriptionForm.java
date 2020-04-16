package oc_lade.form;

import javax.validation.constraints.NotNull;

public class InscriptionForm {
	
	@NotNull(message="Veuillez saisir un prénom.")
    private String prenomNouvelUtilisateur;
	@NotNull(message="Veuillez saisir un nom.")
    private String nomNouvelUtilisateur;
	@NotNull(message="Veuillez saisir un email.")
    private String emailNouvelUtilisateur;
	@NotNull(message="Veuillez saisir un mot-de-passe.")
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
