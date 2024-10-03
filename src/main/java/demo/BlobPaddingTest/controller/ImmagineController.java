package demo.BlobPaddingTest.controller;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.imageio.ImageIO;
import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import demo.BlobPaddingTest.dao.ImmagineDAO;
import demo.BlobPaddingTest.model.Immagine;
import demo.BlobPaddingTest.model.Utente;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;




@Controller
public class ImmagineController {
	
	@Autowired
	ImmagineDAO service;
	
	
	@PostMapping("/inserisciImmagine")
	public String inserisciImmagine(HttpServletRequest request,@RequestParam("immagine") MultipartFile file, HttpSession session, Model model) throws IOException, SerialException, SQLException {
		Utente u= (Utente) session.getAttribute("utente"); 
		//(Integer) session.getAttribute("idutente");
		
		
		byte[] bytes = file.getBytes();
        Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);
        //System.out.println("0");
        Immagine image = new Immagine();
       // System.out.println("1");
        image.setImmagine(blob);
       // System.out.println("2");
        image.setIdutente(u.getIdutente());
        //image.setIdutente(idutente);
       // System.out.println("3");
        session.setAttribute("idutente", u.getIdutente());
       
        //model.addAttribute("session", session);
        service.inserisci(image);
		
		return "/profilop";
	}
	
	
	/*@GetMapping("/visualizzaImmagini")// QUESTO NON ME LE DECODIFICA
	public String visualizzaImmaginiUtente(HttpSession session, Model model) {
	    Integer idutente = (Integer) session.getAttribute("idutente");
	    List<Immagine> immagini = (List<Immagine>) service.visualizzaImmagini(idutente);
	    model.addAttribute("immagini", immagini);
	    return "tutteimmagini";
	}*/
	
	@GetMapping("/listaImmagini")
	public String listaImmagini(HttpServletRequest request, Model model) {
		List<Immagine> listaImmagine= service.selezionaImmagini();
		//request.setAttribute("listaImmagine", listaImmagine);
		//System.out.println(listaImmagine);
		model.addAttribute("listaImmagine", listaImmagine);
		return "tutteimmagini";
	}
	/*@GetMapping("/visualizzaImmagini")
	public ResponseEntity<List<byte[]>> visualizzaImmaginiUtente(HttpSession session) throws IOException, SQLException {
	    Integer idUtente = (Integer) session.getAttribute("idutente");
	    if (idUtente == null) {
	        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
	    }
	    System.out.println("entrato nella lista");
	    List<Immagine> immagini = service.visualizzaImmagini(idUtente);
	    List<byte[]> immaginiBytes = new ArrayList<>();

	    for (Immagine immagine : immagini) {
	    	System.out.println("1");
	        Blob blob = immagine.getImmagine();
	        byte[] bytes = blob.getBytes(1, (int) blob.length());
	        immaginiBytes.add(bytes);
	    }

	    return new ResponseEntity<>(immaginiBytes, HttpStatus.OK);
	}*/
	
	/*@GetMapping("/risultato/{id}") // QUESTO FUNZIONA SOLO SE PASSO L'ID DELL'IMMAGINE
	public ResponseEntity<byte[]> visualizzaImmagine(@PathVariable("id") Integer id) throws SerialException, SQLException, IOException {
	    Immagine immagine = service.visualizzaImmagine(id);// creare metodo che visualizza immagine dato l'id

	    if (immagine == null) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

	    Blob blob = immagine.getImmagine();
	    byte[] bytes = blob.getBytes(1, (int) blob.length());

	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.IMAGE_JPEG);  // Oppure il formato appropriato in base al tipo di immagine

	    return new ResponseEntity<>(bytes, headers, HttpStatus.OK);
	}*/
	/*@GetMapping("/tutteimmagini")
	public ResponseEntity<List<byte[]>> visualizzaImmaginiUtente(HttpSession session) throws SerialException, SQLException, IOException {
	    Integer idutente = (Integer) session.getAttribute("idutente");
	    if (idutente == null) {
	        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
	    }

	    List<Immagine> immagini = service.visualizzaImmagini(idutente);
	    if (immagini == null || immagini.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

	    List<byte[]> immaginiBytes = new ArrayList<>();
	    for (Immagine immagine : immagini) {
	        Blob blob = immagine.getImmagine();
	        byte[] bytes = blob.getBytes(1, (int) blob.length());
	        immaginiBytes.add(bytes);
	    }

	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.IMAGE_JPEG);  // Oppure il formato appropriato in base al tipo di immagine

	    return new ResponseEntity<>(immaginiBytes, headers, HttpStatus.OK);
	}*/
	
	/*@GetMapping("/tutteimmagini")// restituisce solo la prima che è stata caricata dall'utente
	public ResponseEntity<Resource> visualizzaImmaginiUtente(HttpSession session) throws SerialException, SQLException, IOException {
	    Integer idutente = (Integer) session.getAttribute("idutente");
	    if (idutente == null) {
	        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
	    }

	    List<Immagine> immagini = service.visualizzaImmagini(idutente);
	    if (immagini == null || immagini.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

	    // Supponendo che tu voglia restituire solo la prima immagine dell'utente
	    Immagine immagine = immagini.get(0);
	    Blob blob = immagine.getImmagine();
	    byte[] bytes = blob.getBytes(1, (int) blob.length());
	    
	    ByteArrayResource resource = new ByteArrayResource(bytes);

	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.IMAGE_JPEG);

	    return new ResponseEntity<>(resource, headers, HttpStatus.OK);
	}*/
	
	/*@GetMapping("/tutteimmagini") //ne recupera solo una e ha una dimensione ridotta
	public ResponseEntity<Resource> visualizzaImmaginiUtente(HttpSession session) throws IOException, SQLException {
	    Integer idutente = (Integer) session.getAttribute("idutente");
	    if (idutente == null) {
	        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
	    }

	    List<Immagine> immagini = service.visualizzaImmagini(idutente);
	    if (immagini == null || immagini.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

	   
	    Immagine immagine = immagini.get(1);
	    Blob blob = immagine.getImmagine();

	    BufferedImage image = ImageIO.read(blob.getBinaryStream());
	    int width = 200; 
	    int height = 200;
	    BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	    Graphics2D g = resizedImage.createGraphics();
	    g.drawImage(image, 0, 0, width, height, null);
	    g.dispose();

	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    ImageIO.write(resizedImage, "jpg", baos);
	    byte[] resizedBytes = baos.toByteArray();

	    ByteArrayResource resource = new ByteArrayResource(resizedBytes);

	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.IMAGE_JPEG);

	    return new ResponseEntity<>(resource, headers, HttpStatus.OK);
	}*/
	/*@GetMapping("/risultati")//restituisce una lista di id 
	public ResponseEntity<List<Integer>> visualizzaIdsImmagini(HttpSession session) {
		Integer idutente = (Integer) session.getAttribute("idutente");
		List<Immagine> immagini = service.visualizzaImmagini(idutente); 

	    if (immagini == null || immagini.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

	    List<Integer> ids = immagini.stream()
	                                .map(Immagine::getId)
	                                .collect(Collectors.toList());

	    return new ResponseEntity<>(ids, HttpStatus.OK);
	}*/
	
	@GetMapping("/risultato/{id}")
	public ResponseEntity<byte[]> visualizzaImmagine(@PathVariable("id") Integer id) throws SerialException, SQLException, IOException {
	    Immagine immagine = service.visualizzaImmagine(id);// creare metodo che visualizza immagine dato l'id

	    if (immagine == null) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

	    Blob blob = immagine.getImmagine();
	    byte[] bytes = blob.getBytes(1, (int) blob.length());

	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.IMAGE_JPEG);  // Oppure il formato appropriato in base al tipo di immagine

	    return new ResponseEntity<>(bytes, headers, HttpStatus.OK);
	}
	
}
