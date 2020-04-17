package oc_lade.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import oc_lade.model.Utilisateur;

@Controller
@RequestMapping("/utilisateur")
public class UtilisateurController {

	@InitBinder
	public void ibnnitBinder(WebDataBinder webDataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/inscription_2")
	public String showForm(Model model) {
		
		model.addAttribute("utilisateur", new Utilisateur());
		
		return "inscription_2";
	}
	
	@RequestMapping("/traitement_inscription_2")
	public String traitementInscription(@Valid @ModelAttribute("utilisateur") Utilisateur utilisateur, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			
			return "inscription_2";
		
		} else {
			
			return "resultat_inscription_2";
		}
	}
}
