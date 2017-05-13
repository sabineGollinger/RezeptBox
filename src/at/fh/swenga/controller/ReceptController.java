package at.fh.swenga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import at.fh.swenga.dao.ReceptDao;
import at.fh.swenga.model.ReceptModel;

@Controller
public class ReceptController {

	@Autowired
	ReceptDao ReceptDao;

	@RequestMapping(value = { "/", "list" })
	public String index(Model model) {

		List<ReceptModel> Recepts = ReceptDao.getRecepts();
		model.addAttribute("Recepts", Recepts);
		return "index";
	}

	@RequestMapping("/fillReceptList")
	@Transactional
	public String fillData(Model model) {

		ReceptModel p1 = new ReceptModel("Johann", "Blauensteiner", "now");
		ReceptDao.persist(p1);

		ReceptModel p2 = new ReceptModel("Max", "Mustermann", "now");
		ReceptDao.persist(p2);

		ReceptModel p3 = new ReceptModel("Jane", "Doe", "now");
		ReceptDao.persist(p3);

		return "forward:list";
	}

	@RequestMapping("/searchRecepts")
	public String search(Model model, @RequestParam String searchString) {
		model.addAttribute("Recepts", ReceptDao.searchRecepts(searchString));
		return "index";
	}

	@RequestMapping("/delete")
	public String deleteData(Model model, @RequestParam int id) {
		ReceptDao.delete(id);

		return "forward:list";
	}

	// @ExceptionHandler(Exception.class)
	public String handleAllException(Exception ex) {

		return "error";

	}
}