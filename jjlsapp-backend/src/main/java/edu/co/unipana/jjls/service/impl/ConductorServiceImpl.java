/**
 * 
 */
package edu.co.unipana.jjls.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.co.unipana.jjls.model.Conductor;
import edu.co.unipana.jjls.repo.IConductorRepo;
import edu.co.unipana.jjls.service.IConductorService;

/**
 * Servicio que contiene la implementacion para conductores
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
@Service()
public class ConductorServiceImpl implements IConductorService {

	@Autowired
	private IConductorRepo conductorRepo;

	
	@Override
	public Conductor guardar(Conductor conductor) {
		return conductorRepo.save(conductor);
	}

	@Override
	public Conductor modificar(Conductor t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conductor leer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conductor> listar() {
		return conductorRepo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

