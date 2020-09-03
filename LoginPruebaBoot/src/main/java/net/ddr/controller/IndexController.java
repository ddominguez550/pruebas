package net.ddr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ddr.service.IPasatiempoService;

@Controller
public class IndexController {
	
	@Value("${spring.application.name}")
    String appName;
	
	@Autowired
	private IPasatiempoService pasatiempoService;
	
	@GetMapping("/")
    public String indexPage(Model model) {
        model.addAttribute("appName", appName);
        System.out.println(appName);
        model.addAttribute("pasatiempos", pasatiempoService.findAll());
        return "index";
    }
	
	@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("appName", "Hello World, from Spring Boot 2 MVC");
        return "index";
    }

}
