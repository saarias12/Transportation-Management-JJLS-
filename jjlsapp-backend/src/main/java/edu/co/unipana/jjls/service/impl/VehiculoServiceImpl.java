/**
 * 
 */
package edu.co.unipana.jjls.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.co.unipana.jjls.model.Vehiculo;
import edu.co.unipana.jjls.repo.IVehiculoRepo;
import edu.co.unipana.jjls.service.IVehiculoService;

/**
 * Servicio que contiene la implementacion para vehiculos
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
@Service()
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepo vehiculoRepo;

	
	@Override
	public Vehiculo guardar(Vehiculo vehiculo) {
		return vehiculoRepo.save(vehiculo);
	}

	@Override
	public Vehiculo modificar(Vehiculo t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vehiculo leer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehiculo> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

