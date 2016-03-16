package tablonanuncios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tablonanuncios.Anuncio;
import tablonanuncios.TablonController;

@Controller
public class ShowControllerEspecie {

	@RequestMapping("/showespecie")
	public String mostrar(@RequestParam int numAnuncio, Model model) {

		Anuncio anuncio = TablonController.anuncios.get(numAnuncio);
		model.addAttribute("anuncio", anuncio);

		return "showespecie";
	}
}