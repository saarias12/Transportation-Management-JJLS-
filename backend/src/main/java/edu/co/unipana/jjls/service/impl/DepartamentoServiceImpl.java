/**
 * 
 */
package edu.co.unipana.jjls.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.co.unipana.jjls.model.Departamento;
import edu.co.unipana.jjls.model.Vehiculo;
import edu.co.unipana.jjls.repo.IDepartamentoRepo;
import edu.co.unipana.jjls.repo.IVehiculoRepo;
import edu.co.unipana.jjls.service.IDepartamentoService;
import edu.co.unipana.jjls.service.IVehiculoService;

/**
 * Servicio que contiene la implementacion para departamentos
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
@Service()
public class DepartamentoServiceImpl implements IDepartamentoService {

	@Autowired
	private IDepartamentoRepo departamentoRepo;

	
	@Override
	public Departamento guardar(Departamento dep) {
		return departamentoRepo.save(dep);
	}

	@Override
	public Departamento modificar(Departamento t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departamento leer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departamento> listar() {
		return departamentoRepo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

