package Ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EventosContorller {
	@RequestMapping ("/eventos/form")
	public String form() {
		return "formEvento";
	

}
}