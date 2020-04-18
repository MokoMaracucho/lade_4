package oc_lade.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oc_lade.exception.ResourceNotFoundException;
import oc_lade.entity.Privilege;
import oc_lade.entity.Utilisateur;
import oc_lade.repository.UtilisateurRepository;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	@Override
	@Transactional
	public void enregistrerUtilisateur(Utilisateur utilisateur) {
		
		UUID idUtilisateur = UUID.randomUUID();
		Timestamp dateInscriptionUtilisateur = new Timestamp(System.currentTimeMillis());
		
		utilisateur.setIdUtilisateur(idUtilisateur);
		utilisateur.setPrivilegeUtilisateur(Privilege.UTILISATEUR);
		utilisateur.setDateInscriptionUtilisateur(dateInscriptionUtilisateur);
		
		utilisateurRepository.save(utilisateur);
	}
	
	@Override
	@Transactional
	public List<Utilisateur> listeUtilisateurs() {
		return utilisateurRepository.findAll();
	}

    @Override
    @Transactional
    public Utilisateur selectionnerUtilisateurParId(UUID idUtilisateur) throws ResourceNotFoundException {
        return utilisateurRepository.findById(idUtilisateur).orElseThrow(() -> new ResourceNotFoundException(idUtilisateur));
    }

    @Override
    @Transactional
    public void supprimerUtilisateurParId(UUID idUtilisateur) throws ResourceNotFoundException {
    	utilisateurRepository.deleteById(idUtilisateur);
    }
}




//org.springframework.beans.factory.UnsatisfiedDependencyException: 
//Error creating bean with name 'utilisateurController': 
//Unsatisfied dependency expressed through field 'utilisateurService'; 
//nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: 
//Error creating bean with name 'utilisateurServiceImpl': 
//Unsatisfied dependency expressed through field 'utilisateurRepository'; 
//nested exception is org.springframework.beans.factory.BeanCreationException: 
//Error creating bean with name 'utilisateurRepository': Invocation of init method failed; 
//nested exception is java.lang.IllegalArgumentException: Not a managed type: class oc_lade.model.Utilisateur
