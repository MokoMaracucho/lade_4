package oc_lade.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import oc_lade.model.Utilisateur;

@Controller
//@RequestMapping("/inscription")
public class InscriptionController {
	
//	public static final String ATT_MESSAGE 				= "message";
//	public static final String ATT_INSCRIPTION_FORM		= "inscriptionForm";

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/inscription")
    public String showInscription(Model model) {

		model.addAttribute("utilisateur", new Utilisateur());

        return "inscription";
    }

    @PostMapping("/resultat_inscription")
    public String saveUtilisateur(@Valid @ModelAttribute("utilisateur") Utilisateur utilisateur, BindingResult bindingResult) {

        System.out.println("FirstName : " + utilisateur.getPrenomUtilisateur());
        System.out.println("LastName : " + utilisateur.getNomUtilisateur());
        System.out.println("Username : " + utilisateur.getEmailUtilisateur());
        System.out.println("Password : " + utilisateur.getMotDePasseUtilisateur());
        System.out.println("Email : " + utilisateur.getConfirmationMotDePasseUtilisateur());

    	if(bindingResult.hasErrors()) {
//
//	        model.addAttribute("message", "L'inscription a échouée...");
//	        model.addAttribute("utilisateur", utilisateur);
//			
			return "inscription";
//		
		} else {

//	        model.addAttribute("message", "Vous êtes maintenant inscrit.");
//	        model.addAttribute("utilisateur", utilisateur);
	        
			return "resultat_inscription";
		}
    }
}
