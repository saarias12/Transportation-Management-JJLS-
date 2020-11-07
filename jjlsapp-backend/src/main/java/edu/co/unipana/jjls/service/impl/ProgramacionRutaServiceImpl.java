/**
 * 
 */
package edu.co.unipana.jjls.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.co.unipana.jjls.model.ProgramacionRuta;
import edu.co.unipana.jjls.repo.IProgramacionRutaRepo;
import edu.co.unipana.jjls.service.IProgramacionRutaService;

/**
 * Servicio que contiene la implementacion para programacion de rutas
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
@Service()
public class ProgramacionRutaServiceImpl implements IProgramacionRutaService {

	@Autowired
	private IProgramacionRutaRepo programacionRutaRepo;

	
	@Override
	public ProgramacionRuta guardar(ProgramacionRuta programacion) {
		return programacionRutaRepo.save(programacion);
	}

	@Override
	public ProgramacionRuta modificar(ProgramacionRuta t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProgramacionRuta leer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProgramacionRuta> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

