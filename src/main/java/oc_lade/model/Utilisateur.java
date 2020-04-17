package oc_lade.model;

import java.sql.Timestamp;
import java.util.UUID;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Utilisateur {
	
//	@Id
//	@GeneratedValue
//	@NotBlank
//	@Column(name="id_utilisateur")
//	private UUID idUtilisateur;
	
	@NotNull(message="Veuillez saisir un prénom.")
    @Min(value = 1, message = "Veuillez saisir un prénom valide.")
    @Max(value = 30, message = "Veuillez saisir un prénom valide.")
	private String prenomUtilisateur;
	
	@NotNull(message="Veuillez saisir un nom.")
    @Min(value = 1, message = "Veuillez saisir un nom valide.")
    @Max(value = 30, message = "Veuillez saisir un nom valide.")
	private String nomUtilisateur;
	
	@NotNull(message="Veuillez saisir un email.")
    @Email(message="Veuillez saisir un email valide.")
	private String emailUtilisateur;
	
	@NotNull(message="Veuillez saisir un mot-de-passe.")
//	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
	private String motDePasseUtilisateur;
	
	@NotNull(message="Veuillez confirmer le mot-de-passe.")
    private String confirmationMotDePasseUtilisateur;

//	@NotBlank
//	private Privilege privilegeUtilisateur;
//	
//	@NotBlank
//	private Timestamp dateInscriptionUtilisateur;
//
//	public UUID getIdUtilisateur() {
//		return idUtilisateur;
//	}
//
//	public void setIdUtilisateur(UUID idUtilisateur) {
//		this.idUtilisateur = idUtilisateur;
//	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	public String getEmailUtilisateur() {
		return emailUtilisateur;
	}

	public void setEmailUtilisateur(String emailUtilisateur) {
		this.emailUtilisateur = emailUtilisateur;
	}

	public String getMotDePasseUtilisateur() {
		return motDePasseUtilisateur;
	}

	public void setMotDePasseUtilisateur(String motDePasseUtilisateur) {
		this.motDePasseUtilisateur = motDePasseUtilisateur;
	}
	
	public String getConfirmationMotDePasseUtilisateur() {
		return confirmationMotDePasseUtilisateur;
	}

	public void setConfirmationMotDePasseUtilisateur(String confirmationMotDePasseUtilisateur) {
		this.confirmationMotDePasseUtilisateur = confirmationMotDePasseUtilisateur;
	}

//	public Privilege getPrivilegeUtilisateur() {
//		return privilegeUtilisateur;
//	}
//
//	public void setPrivilegeUtilisateur(Privilege privilegeUtilisateur) {
//		this.privilegeUtilisateur = privilegeUtilisateur;
//	}
//
//	public Timestamp getDateInscriptionUtilisateur() {
//		return dateInscriptionUtilisateur;
//	}
//
//	public void setDateInscriptionUtilisateur(Timestamp dateInscriptionUtilisateur) {
//		this.dateInscriptionUtilisateur = dateInscriptionUtilisateur;
//	}
}
