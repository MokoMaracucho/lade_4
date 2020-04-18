package oc_lade.entity;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_utilisateur")
public class Utilisateur {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotBlank
	@Column(name="id_utilisateur", length=30)
	private UUID idUtilisateur;
	
	@NotNull(message="Veuillez saisir un prénom.")
    @Min(value = 1, message = "Veuillez saisir un prénom valide.")
    @Max(value = 30, message = "Veuillez saisir un prénom valide.")
	@Column(name="prenom_utilisateur")
	private String prenomUtilisateur;
	
	@NotNull(message="Veuillez saisir un nom.")
    @Min(value = 1, message = "Veuillez saisir un nom valide.")
    @Max(value = 30, message = "Veuillez saisir un nom valide.")
	@Column(name="nom_utilisateur", length=30)
	private String nomUtilisateur;
	
	@NotNull(message="Veuillez saisir un email.")
    @Email(message="Veuillez saisir un email valide.")
	@Column(name="email_utilisateur", length=30, unique=true)
	private String emailUtilisateur;
	
	@NotNull(message="Veuillez saisir un mot-de-passe.")
//	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
	@Column(name="mot_de_passe_utilisateur", length=30)
	private String motDePasseUtilisateur;
	
	@NotNull(message="Veuillez confirmer le mot-de-passe.")
	@Transient
    private String confirmationMotDePasseUtilisateur;

	@NotBlank
	@Column(name="privilege_utilisateur", length=30)
	private Privilege privilegeUtilisateur;
	
	@NotBlank
	@Column(name="date_inscription_utilisateur")
	private Timestamp dateInscriptionUtilisateur;
	
	public Utilisateur() {
	}

	public UUID getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(UUID idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

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

	public Privilege getPrivilegeUtilisateur() {
		return privilegeUtilisateur;
	}

	public void setPrivilegeUtilisateur(Privilege privilegeUtilisateur) {
		this.privilegeUtilisateur = privilegeUtilisateur;
	}

	public Timestamp getDateInscriptionUtilisateur() {
		return dateInscriptionUtilisateur;
	}

	public void setDateInscriptionUtilisateur(Timestamp dateInscriptionUtilisateur) {
		this.dateInscriptionUtilisateur = dateInscriptionUtilisateur;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", prenomUtilisateur=" + prenomUtilisateur + ", nomUtilisateur=" + nomUtilisateur + ", emailUtilisateur=" + emailUtilisateur + ", motDePasseUtilisateur=" + motDePasseUtilisateur + ", confirmationMotDePasseUtilisateur=" + confirmationMotDePasseUtilisateur + ", privilegeUtilisateur=" + privilegeUtilisateur + ", dateInscriptionUtilisateur=" + dateInscriptionUtilisateur + "]";
	}
}
