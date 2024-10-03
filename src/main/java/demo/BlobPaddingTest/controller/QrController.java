package demo.BlobPaddingTest.controller;

import java.io.IOException;
import java.util.Base64;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.google.zxing.WriterException;

import demo.BlobPaddingTest.model.QrCodeGenerator;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class QrController {
	  
	  private static final String QR_CODE_IMAGE_PATH = "./src/main/resources/static/immagini/QR.png";

	    @GetMapping("/qrgenerator")
	    public String getQRCode(Model model){
	        String medium="https://rahul26021999.medium.com/";
	        String github="https://www.youtube.com/watch?v=dQw4w9WgXcQ";//da modificare 
	        //localhost8080:/listaImmagini
	        //System.out.println("1");
	        byte[] image = new byte[0];
	        try {

	            // Generate and Return Qr Code in Byte Array
	            image = QrCodeGenerator.getQRCodeImage(medium,250,250);

	            // Generate and Save Qr Code Image in static/image folder
	            QrCodeGenerator.generateQRCodeImage(github,250,250,QR_CODE_IMAGE_PATH);
	            //System.out.println("2");
	        } catch (WriterException | IOException e) {
	            e.printStackTrace();
	        }
	        // Convert Byte Array into Base64 Encode String
	        String qrcode = Base64.getEncoder().encodeToString(image);
	        //System.out.println("3");
	        model.addAttribute("medium",medium);
	        model.addAttribute("github",github);
	        model.addAttribute("qrcode",qrcode);
	        //System.out.println("4");
	        return "QrCode";
	    
	}
	  	
	  	
	  	@GetMapping("/qrcode")
	  	public String test(HttpServletRequest request) {
	  		return "qrcode";
	  	}
	  	
	  /*	@GetMapping("/provaBho")
	  	public String testqr(HttpServletRequest request) {
	  		return "provaBho";
	  	}*/
}
