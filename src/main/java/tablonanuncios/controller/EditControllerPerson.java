package tablonanuncios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tablonanuncios.Anuncio;
import tablonanuncios.TablonController;

@Controller
public class EditControllerPerson {


	@RequestMapping("/editperson")
	public String insertar(Anuncio anuncio, Model model) {

		TablonController.anuncios.add(anuncio); //** pendiente de cambiar por sentencia con editar person

		return "editperson";
	}

}