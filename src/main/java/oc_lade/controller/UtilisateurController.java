package oc_lade.controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oc_lade.exception.ResourceNotFoundException;
import oc_lade.entity.Utilisateur;
import oc_lade.service.UtilisateurService;

@Controller
@RequestMapping("/utilisateur")
public class UtilisateurController {
	
//	public static final String ATT_MESSAGE 				= "message";
//	public static final String ATT_INSCRIPTION_FORM		= "inscriptionForm";
	
	private static final Logger logger = LoggerFactory.getLogger(UtilisateurController.class);
	
	@InitBinder
    public void initBinder(WebDataBinder dataBinder) {
		
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
	
	@Autowired
	private UtilisateurService utilisateurService;
	
	@RequestMapping("/inscription_utilisateur")
    public String inscriptionUtilisateur(Model model) {
		
		logger.debug("Dans la méthode manipulant le formulaire d'inscription.");
		
		Utilisateur utilisateur = new Utilisateur();
		
		model.addAttribute("utilisateur", utilisateur);
		
        return "inscription_utilisateur";
    }

    @PostMapping("/enregistrer_utilisateur")
    public String enregistrerUtilisateur(@ModelAttribute("utilisateur") Utilisateur utilisateur, BindingResult theBindingResult) {
    	
    	System.out.println("Prénom : " 						+ utilisateur.getPrenomUtilisateur());
    	System.out.println("Nom : " 						+ utilisateur.getNomUtilisateur());
    	System.out.println("Email : " 						+ utilisateur.getEmailUtilisateur());
    	System.out.println("Mot-de-passe : " 				+ utilisateur.getMotDePasseUtilisateur());
    	System.out.println("Confirmation mot-de-passe : " 	+ utilisateur.getConfirmationMotDePasseUtilisateur());
    	
//    	utilisateurService.traitementFormulaireInscription(utilisateur);
    	
//    	TraitementFormulaireInscription traitementFormulaireInscription = new TraitementFormulaireInscription();
//		
//		BN_Utilisateur nouvelUtilisateur = traitementFormulaireInscription.traitementFormulaireInscription(request);
		
//		HttpSession session = request.getSession();
//		
//		if(traitementFormulaireInscription.getErreursInscription().isEmpty()) {
//			
//			session.setAttribute(ATT_SESSION_UTILISATEUR, nouvelUtilisateur);
//
//	        response.sendRedirect(URL_ACCUEIL);
//		
//		} else {
//			
//			request.setAttribute(ATT_TRAITEMENT_FORMULAIRE_INSCRIPTION, traitementFormulaireInscription);
//			request.setAttribute(ATT_NOUVEL_UTILISATEUR, 				nouvelUtilisateur);
//			
//			session.setAttribute(ATT_SESSION_UTILISATEUR, null);
//			
//			this.getServletContext().getRequestDispatcher(VUE_INSCRIPTION).forward(request, response);
//		}
    	
    	
    	
    	
    	
    	
    	
        if (theBindingResult.hasErrors()) {
        	
            return "inscription_utilisateur";
            
        } else {
        	
        	utilisateurService.enregistrerUtilisateur(utilisateur);
        	
            return "redirect:/utilisateur/liste_utilisateurs";
        }
    }
	
	@GetMapping("/liste_utilisateurs")
    public String listeUtilisateurs(Model model) {
		
        List<Utilisateur> listeUtilisateurs = utilisateurService.listeUtilisateurs();
        
        model.addAttribute("listeUtilisateurs", listeUtilisateurs);
        
        return "liste_utilisateurs";
    }

//    @GetMapping("/maj_utilisateur")
//    public String majUtilisateur(@RequestParam("idUtilisateur") UUID idUtilisateur, Model model) throws ResourceNotFoundException {
//        Utilisateur utilisateur = utilisateurService.selectionnerUtilisateurParId(idUtilisateur);
//        model.addAttribute("utilisateur", utilisateur);
//        return "maj_utilisateur";
//    }

//    @GetMapping("/supprimer_utilisateur_par_id")
//    public String supprimerUtilisateur(@RequestParam("idUtilisateur") UUID idUtilisateur) throws ResourceNotFoundException {
//    	utilisateurService.supprimerUtilisateurParId(idUtilisateur);
//        return "redirect:/utilisateur/liste_utilisateurs";
//    }
}
