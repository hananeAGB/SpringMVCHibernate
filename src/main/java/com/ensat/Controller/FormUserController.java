///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package com.ensat.Controller;

import com.ensat.dao.IntDao;
import com.ensat.dao.UserDao;
import com.ensat.model.Utilisateur;
import com.ensat.service.Services;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import org.omg.PortableServer.Servant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.mvc.extensions.ajax.AjaxUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author admin
 */
@Controller
//@ControllerAdvice
public class FormUserController {        //d'apres la documentation de baeldung

private Services userService;private Map<Integer, Utilisateur> UtilisateurMap = new HashMap<>();
 
  @Autowired(required=true)
    public void setUserService(Services userService) {
        this.userService = userService;
    }


    public Services getUserService() {
        return userService;
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String submit(
            @ModelAttribute("Utilisateur") Utilisateur utilisateur,
            BindingResult result, ModelMap model) {
        System.out.println("tooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooourist here ");
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("nom", utilisateur.getNom());
        //model.addAttribute("id", utilisateur.getIdUser());
        model.addAttribute("prenom", utilisateur.getPrenom());
        model.addAttribute("profession", utilisateur.getProfession());
        model.addAttribute("photo", utilisateur.getPhoto());
         model.addAttribute("msg", "Welcome to Island!");
         model.addAttribute("user", utilisateur);
         System.out.println(utilisateur);
         Utilisateur t=new Utilisateur();
         t.setIdUser(2);t.setNom("hanane");
         System.out.println(t.getNom());
         if(utilisateur!=null) userService.adduser(utilisateur);
       
      
       UtilisateurMap.put(utilisateur.getIdUser(), utilisateur);
        System.out.println("l'utilisateur " + utilisateur.getNom() + " de prenom " + utilisateur.getPrenom()+" vide "+ utilisateur.getProfession() );
        return "listUtilisateur";
        //return "utilisateurView";
    }

//    @ModelAttribute
//    public void addAttributes(Model model) {
//        model.addAttribute("msg", "Welcome to Island!");
//    }
@RequestMapping(value = "/editUser", method = RequestMethod.POST)
    public String editUtilisateur(
            @ModelAttribute("Utilisateur") Utilisateur utilisateur,
            BindingResult result, ModelMap model) {
        System.out.println("tooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooourist here ");
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("nom", utilisateur.getNom());
        model.addAttribute("id", utilisateur.getIdUser());
        model.addAttribute("prenom", utilisateur.getPrenom());
        model.addAttribute("profession", utilisateur.getProfession());
        model.addAttribute("photo", utilisateur.getPhoto());
      
       UtilisateurMap.put(utilisateur.getIdUser(), utilisateur);
        System.out.println("l'utilisateur " + utilisateur.getNom() + " de prenom " + utilisateur.getPrenom()+" vide "+ utilisateur.getProfession() );
        return "hello";
        //return "utilisateurView";
    }
}

// Invoked on every request
// Invoked initially to create the "form" attribute
// Once created the "form" attribute comes from the HTTP session (see @SessionAttributes)
//	@ModelAttribute("formBean")
//	public utilisateur createFormBean() {
//		return new utilisateur();
//	}
//	
////	@GetMapping
//	public void form() {
//	}
//
////	@PostMapping
//	public String processSubmit(@Valid utilisateur formBean, BindingResult result, 
//								@ModelAttribute("ajaxRequest") boolean ajaxRequest, 
//								Model model, RedirectAttributes redirectAttrs) {
//		if (result.hasErrors()) {
//			return null;
//		}
//		// Typically you would save to a db and clear the "form" attribute from the session 
//		// via SessionStatus.setCompleted(). For the demo we leave it in the session.
//		String message = "le résultat a été enregistré avec succés .  Bound " + formBean;
//		// Success response handling
//		if (ajaxRequest) {
//			// prepare model for rendering success message in this request
//			model.addAttribute("message", message);
////                        SessionStatus.setCompleted();
//			return null;
//		} else {
//			// store a success message for rendering on the next request after redirect
//			// redirect back to the form to render the success message along with newly bound values
//			redirectAttrs.addFlashAttribute("message", message);
////                        SessionStatus.setCompleted();
//			return "redirect:/form";			
//		}
//	}

