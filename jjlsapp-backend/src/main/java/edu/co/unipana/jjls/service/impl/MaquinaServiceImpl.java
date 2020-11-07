/**
 * 
 */
package edu.co.unipana.jjls.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.co.unipana.jjls.model.Maquina;
import edu.co.unipana.jjls.repo.IMaquinaRepo;
import edu.co.unipana.jjls.service.IMaquinaService;

/**
 * Servicio que contiene la implementacion para maquinas
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
@Service()
public class MaquinaServiceImpl implements IMaquinaService {

	@Autowired
	private IMaquinaRepo maquinaRepo;

	
	@Override
	public Maquina guardar(Maquina maquina) {
		return maquinaRepo.save(maquina);
	}

	@Override
	public Maquina modificar(Maquina t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Maquina leer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Maquina> listar() {
		return maquinaRepo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

