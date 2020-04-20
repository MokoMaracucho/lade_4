package lade.service;

import java.util.List;
import java.util.UUID;

import lade.entity.Utilisateur;
import lade.exception.ResourceNotFoundException;

public interface UtilisateurService {

    public void enregistrerUtilisateur(Utilisateur utilisateur);

    public List<Utilisateur> listeUtilisateurs();

//    public Utilisateur selectionnerUtilisateurParId(UUID idUtilisateur) throws ResourceNotFoundException;

//    public void supprimerUtilisateurParId(UUID idUtilisateur) throws ResourceNotFoundException;
}
