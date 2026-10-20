package co.edu.udistrital.controller;

import java.io.Serializable;

import co.edu.udistrital.model.AspiranteDTO;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("aspiranteBean")
@SessionScoped
public class AspiranteBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private AspiranteDTO dto;

	public AspiranteDTO getDto() {
		return dto;
	}

	public void setDto(AspiranteDTO dto) {
		this.dto = dto;
	}
	
	public void registrarAspirante() {
		System.out.println("Aspirante: " + dto.getNombre());
	}
	
}
