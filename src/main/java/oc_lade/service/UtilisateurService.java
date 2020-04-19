package oc_lade.service;

import java.util.List;
import java.util.UUID;

import oc_lade.exception.ResourceNotFoundException;
import oc_lade.entity.Utilisateur;

public interface UtilisateurService {

    public void enregistrerUtilisateur(Utilisateur utilisateur);

    public List<Utilisateur> listeUtilisateurs();

//    public Utilisateur selectionnerUtilisateurParId(UUID idUtilisateur) throws ResourceNotFoundException;

//    public void supprimerUtilisateurParId(UUID idUtilisateur) throws ResourceNotFoundException;
}
