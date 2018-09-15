package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Nytimes;
import com.example.demo.services.NytimesService;

@Controller
public class NytimesController {
	
	@GetMapping("/playagame")
	public String playGame(
			@RequestParam(name="choice", required=false) 
				String theChoice, Model model) {
		
		if(theChoice == null) {
			return "index";
		}
		String theOutcome = "error";
		if(theChoice.equals("rock")) {
			theOutcome = "tie";
		}
		if(theChoice.equals("paper")) {
			theOutcome = "win";
		}
		if(theChoice.equals("scissors")) {
			theOutcome = "loss";
		}
		
		model.addAttribute("outcome", theOutcome);
		return "results";
	}
	
	
	private NytimesService nytimesService;
	
	
	public void setNytimesService(NytimesService nytimesService) {
		this.nytimesService = new NytimesService();
	}
	
	 @GetMapping("/")
	 public String indexPage(Model model) {
		    return "test";
	    }
	
	 @GetMapping("/nytimes")
	    public String nytimesForm(Model model) {
		
	        model.addAttribute("nytimes", new Nytimes());
	        return "nytimes";
	    }
	
    @PostMapping("/nytimes")
    public String nytimesSubmit(@ModelAttribute Nytimes nytimes) {
    	this.nytimesService = new NytimesService();
    	//nytimes.setNytimesNews(nytimesService.populateNytimesNews());
    	try {
    	System.out.println("The stories are " );
    	nytimes.setNytimesNews(nytimesService.getNews(nytimes.getSection(),nytimes.getPeriod()));
    	}
    	catch(Exception e) {}
     	
        return "results";
    }
	

}
