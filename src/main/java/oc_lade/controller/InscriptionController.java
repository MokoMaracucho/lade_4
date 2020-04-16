package oc_lade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import oc_lade.form.InscriptionForm;


@Controller
public class InscriptionController {
	
	public static final String ATT_MESSAGE 				= "message";
	public static final String ATT_INSCRIPTION_FORM		= "inscriptionForm";
	
    @ModelAttribute("inscriptionForm")
    public InscriptionForm setInscriptionForm() {
        return new InscriptionForm();
    }
    
    @GetMapping("/inscription")
    public String showInscriptionForm() {
        return "inscription";
    }

    @PostMapping("/succesInscription")
    public String saveUser(@ModelAttribute("inscriptionForm") InscriptionForm inscriptionForm, Model model) {

        // Implement business logic to save user details into a database
        // .....

        System.out.println("Prénom : " 			+ inscriptionForm.getPrenomNouvelUtilisateur());
        System.out.println("Nome : " 			+ inscriptionForm.getNomNouvelUtilisateur());
        System.out.println("Émail : " 			+ inscriptionForm.getEmailNouvelUtilisateur());
        System.out.println("Mot-de-passe : " 	+ inscriptionForm.getMotDePasseNouvelUtilisateur());

        model.addAttribute(ATT_MESSAGE, 			"Vous êtes inscrit !");
        model.addAttribute(ATT_INSCRIPTION_FORM, 	inscriptionForm);

        return "succesInscription";
    }
}
