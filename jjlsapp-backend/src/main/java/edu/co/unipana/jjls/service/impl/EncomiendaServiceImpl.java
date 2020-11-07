/**
 * 
 */
package edu.co.unipana.jjls.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.co.unipana.jjls.model.Encomienda;
import edu.co.unipana.jjls.repo.IEncomiendaRepo;
import edu.co.unipana.jjls.service.IEncomiendaService;

/**
 * Servicio que contiene la implementacion para encomiendas
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
@Service()
public class EncomiendaServiceImpl implements IEncomiendaService {

	@Autowired
	private IEncomiendaRepo encomiendaRepo;

	
	@Override
	public Encomienda guardar(Encomienda encomienda) {
		return encomiendaRepo.save(encomienda);
	}

	@Override
	public Encomienda modificar(Encomienda t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Encomienda leer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Encomienda> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

