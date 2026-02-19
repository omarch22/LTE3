package com.fing.app.controllers;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.fing.app.models.Orden;
import com.fing.app.models.Bounce;
import com.fing.app.models.User;
import com.fing.app.models.Visitor;

@Controller
public class MainCtr{

	@GetMapping("/index")
	public String raiz(Model model){
		ArrayList<String> lista=new ArrayList<>();
		lista.add("Paletas");
		lista.add("Papas");
		lista.add("Jugos");
		lista.add("Soda");
		lista.add("Leche");
		
		ArrayList<Boolean> bounce=new ArrayList<>();
		bounce.add(true);
		bounce.add(false);
		bounce.add(true);
		bounce.add(true);
		bounce.add(false);

		int total=bounce.size();
		long entro=bounce.stream().filter(b->b).count();
		int porcentaje=(int)((entro*100.0)/total);

		model.addAttribute("bounce",bounce);
		model.addAttribute("bouncePorcentaje",porcentaje);
		
		ArrayList<String> listaU=new ArrayList<>();
		listaU.add("Omar");
		listaU.add("Janely");
		listaU.add("Isabela");
		listaU.add("Paola");
		listaU.add("Juan");
		listaU.add("Jorge");
		listaU.add("Sofia");
		
		ArrayList<String> listaN=new ArrayList<>();
		listaN.add("Mongolia");
		listaN.add("Mexico");
		listaN.add("USA");
		listaN.add("China");
		listaN.add("Croacia");
		listaN.add("Paises Bajos");
		listaN.add("Guatemala");
		listaN.add("Honduras");
		
		String usuario="Omar Pereda ;)";
		
		
		

		model.addAttribute("listaU",listaU);
		model.addAttribute("listaN",listaN);
		model.addAttribute("usuario",usuario);

		model.addAttribute("msg","hola");
		model.addAttribute("lista",lista);

		return "index";
	}
	

}