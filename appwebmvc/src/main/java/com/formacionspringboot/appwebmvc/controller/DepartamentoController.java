package com.formacionspringboot.appwebmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.formacionspringboot.appwebmvc.entity.Departamento;
import com.formacionspringboot.appwebmvc.service.DepartamentoService;

@Controller
public class DepartamentoController {

	@Autowired
	private DepartamentoService servicio;

	@GetMapping({"/departamentos"})
	public String listarDepartamentos(Model model) {
		model.addAttribute("key", servicio.listarTodosLosDepartamentos());
		return "departamentos";
	}

	@GetMapping("/departamentos/nuevo")
	public String formularioDepartamento(Model modelo) {
		Departamento newDepartamento = new Departamento();
		modelo.addAttribute("departamentoKey", newDepartamento);
		return "nuevo_departamento";
	}

	@PostMapping("/departamentos")
	public String guardarDepartamento(@ModelAttribute("departamentoKey") Departamento departamento) {
		servicio.guardarDepartamento(departamento);
		return "redirect:/departamentos";
	}

	@GetMapping("/departamentos/editar/{id}")
	public String formularioEdicionDepartamento(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("departamentoKey", servicio.obtenerDepartamentoPorId(id));
		return "editar_departamento";
	}

	@PostMapping("/departamentos/editar/{id}")
	public String editarDepartamento(@PathVariable Long id,
			@ModelAttribute("departamentoKey") Departamento departamento) {
		Departamento departamentoEdit = servicio.obtenerDepartamentoPorId(id);
		departamentoEdit.setNombre(departamento.getNombre());
		departamentoEdit.setFini(departamento.getFini());
		departamentoEdit.setFfin(departamento.getFfin());
		departamentoEdit.setActivo(departamento.isActivo());

		servicio.guardarDepartamento(departamentoEdit);
		return "redirect:/departamentos";
	}

	@GetMapping("/departamentos/borrar/{id}")
	public String eliminarDepartamento(@PathVariable Long id) {
		servicio.eliminarDepartamento(id);
		return "redirect:/departamentos";
	}
}
