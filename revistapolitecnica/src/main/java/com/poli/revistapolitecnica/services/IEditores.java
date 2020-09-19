package com.poli.revistapolitecnica.services;

import java.util.List;

import com.poli.revistapolitecnica.entity.Editores;

public interface IEditores {
	
public List<Editores> getEditores();
	
	public void saveEditores(Editores editores);

	public Editores getEditores(Integer Id);

	public void deleteEditores(Integer Id);

}
