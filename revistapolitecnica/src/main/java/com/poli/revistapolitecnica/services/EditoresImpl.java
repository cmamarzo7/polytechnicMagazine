package com.poli.revistapolitecnica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poli.revistapolitecnica.dao.IEditoresDao;
import com.poli.revistapolitecnica.entity.Editores;

@Service
public class EditoresImpl implements IEditores {

	@Autowired
	private IEditoresDao ieditoresDao;

	@Override
	@Transactional(readOnly = true)

	public List<Editores> getEditores() {
		return (List<Editores>) ieditoresDao.findAll();
	}

	@Override
	public void saveEditores(Editores editores) {

		ieditoresDao.save(editores);

	}

	@Override
	public Editores getEditores(Integer Id) {
		return ieditoresDao.findById(Id).get();
	}

	@Override
	public void deleteEditores(Integer Id) {

		ieditoresDao.deleteById(Id);

	}

}