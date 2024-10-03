package demo.BlobPaddingTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.BlobPaddingTest.dao.UtenteDAO;
import demo.BlobPaddingTest.model.Utente;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class homeController {

	@Autowired
	UtenteDAO service;


	@GetMapping("/login")
	public String login(HttpServletRequest request) {
		return "login-registrazione";
	}

	@GetMapping("/home")
	public String home(HttpServletRequest request) {
		return "home";
	}
	
	@GetMapping("/supporto")
	public String supporto(HttpServletRequest request) {
		return"supporto";
	}
	
	@GetMapping("/registrazione")
	public String registrazione(HttpServletRequest request) {
		return "registrazione";
	}
	
	@GetMapping("/profilop")
	public String profilop(HttpServletRequest request) {
		return "profilop";
	}
	@GetMapping("/homep")
	public String homep (HttpServletRequest request) {
		return "homep";
	}
	
	@GetMapping("/supportop")
	public String supportop (HttpServletRequest request) {
		return "supportop";
	}

	// Questo metodo gestisce una richiesta POST per selezionare gli utenti.
	@PostMapping("/selezionautenti")
	public String selezionaUtenti(Model model, HttpServletRequest request, HttpSession session) {
		// Ottieni la lista degli utenti dal servizio
		//List<Utente> lista = service.selezionaUtenti();

		// Ottieni email e password dalla richiesta
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// Itera attraverso la lista degli utenti
		//for (Utente u : lista) {
			// Verifica se l'email e la password corrispondono
			//if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
				// Imposta il nome utente nella sessione
				//session.setAttribute("idutente", u.getIdutente());
				//session.setAttribute("nome", u.getNome());
				//session.setAttribute("cognome", u.getCognome());
				//session.setAttribute("email", u.getEmail());
				
				//model.addAttribute("session", session);
				// Esempio di modifica dell'email per scopi di visualizzazione
		

				// Se l'utente è trovato, reindirizza alla pagina "utentetrovato"
				//return "profilop";
			//}
		//}
		// Se nessun utente corrisponde, reindirizza alla pagina "errore"
		Utente u=service.selezionaUtenteEmail(email, password);
		session.setAttribute("utente", u);
		
		//System.out.println(u);
		//return "registrazione";
		return "profilop";
	}
	   @PostMapping("/registrati")
	    public String risultato(HttpServletRequest request, HttpSession session, Model model) {

	        String nome= request.getParameter("nome");
	        String cognome= request.getParameter("cognome");
	        String email= request.getParameter("email");
	        String password= request.getParameter("password");

	        Utente u= new Utente(nome, cognome, email, password);
	        session.setAttribute("idutente", u.getIdutente());
			session.setAttribute("nome", u.getNome());
			session.setAttribute("cognome", u.getCognome());
			session.setAttribute("email", u.getEmail());
			//model.addAttribute("session", session);
	        session.setAttribute("utente", u);
			//request.setAttribute("utente", u);
	        service.inserisciUtente(u);
	        
	        return "profilop";
	
	
	   }
	
	
	//@PostMapping("/registrazione")
	/*public String risultato(HttpServletRequest request, Model model) { //registrazione
		//List<Utente> listaUtenti=service.selezionaUtenti();
		String nome= request.getParameter("nome");
		String cognome= request.getParameter("cognome");
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		Utente u= new Utente(nome, cognome, email, password);
		//request.setAttribute("utente", u);
		service.inserisciUtente(u);*/
		//return "profilo";
		
		
		/*for(Utente u:listaUtenti) {
			if(u.getNome().equals(nome)&&u.getCognome().equals(cognome)&&u.getEmail().equals(email)) {
				return "errore";
			}else {
				 u= new Utente(nome, cognome, email, password);
		//request.setAttribute("utente", u);	
		service.inserisciUtente(u);
		model.addAttribute("utente", u);
		break;
			}
		}*/
	//}
	///// sto provando ad aggiornare l'utente
	   
	   @GetMapping("/aggiorna/{id}")
	   public String aggiorna(@PathVariable("id") Integer id, HttpServletRequest request, HttpSession session) {
		  //Integer idutente=(Integer) session.getAttribute("id");
		   String nome= request.getParameter("nome");
		   String cognome= request.getParameter("cognome");
		   String email= request.getParameter("email");
		   String password=request.getParameter("password");
		  // System.out.println("1");
		   Utente utente= new Utente(nome, cognome, email, password);
		  
		  // System.out.println("2");
		   //session.setAttribute("id", idutente);
		   session.setAttribute("utente", utente);
	        //System.out.println("3");
	       
	        
	        service.aggiornaInfo(utente, id);
	        return "redirect:/profilop";
	   }
	   
	   @GetMapping("/formUpdate")
	   public String formUpdate(HttpServletRequest request,  HttpSession session) {
		  
		   Utente u= (Utente) session.getAttribute("utente"); 
	        session.setAttribute("utente", u);
	        return "testmodifica";
	   }
	   
}
