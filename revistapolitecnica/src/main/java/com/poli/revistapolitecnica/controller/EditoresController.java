package com.poli.revistapolitecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.poli.revistapolitecnica.entity.Editores;
import com.poli.revistapolitecnica.services.IEditores;

@RestController
@RequestMapping("/editores")
public class EditoresController {

	@Autowired
	private IEditores ieditores;
	
	@GetMapping("/editores")
	public List<Editores> getEditores() {
		return ieditores.getEditores();
	}
	
	
	@GetMapping("/editores/{editoresId}")
	public Editores getEditores(@PathVariable int editoresId) {

		Editores editores= ieditores.getEditores(editoresId);

		return editores;
	}
	
	@PostMapping("/editores")
	@ResponseStatus(HttpStatus.CREATED)
	public Editores addEditores(@RequestBody Editores editores) {
		
		editores.setId(null);

		ieditores.saveEditores(editores);
		return editores;
	}
	
	@PutMapping("/editores")
	@ResponseStatus(HttpStatus.CREATED)
	public Editores updateEditores(@RequestBody Editores editores) {
		
		ieditores.saveEditores(editores);
		return editores;
	}
	
	@DeleteMapping("/editores/{editoresId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteEditores(@PathVariable int editoresId) {
		
		ieditores.deleteEditores(editoresId);
	}
}
