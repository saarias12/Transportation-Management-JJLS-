package edu.co.unipana.jjls.service;

import java.util.List;

/**
 * Interfaz generica que contiene los metodos de crud para los servicios
 * 
 * @author Sergio Arias
 * @date 2/05/2019
 * @param <T> Generico que indica el tipo de dato asociado al CRUD
 */
public interface ICRUD<T> {

	/**
	 * Metodo que registra  la entidad T en base de datos
	 * 
	 * @author Sergio Arias
	 * @date 2/05/2019
	 * @param t Objeto a registrar
	 * @return Entidad registrada en base de datos
	 */
	T guardar(T t);

	/**
	 * Metodo que modifica la entidad T en base de datos
	 * 
	 * @author Sergio Arias
	 * @date 2/05/2019
	 * @param t Objeto a modificar
	 * @return Entidad modificada en base de datos
	 */
	T modificar(T t);

	/**
	 * Metodo que obtiene una entidad en base de datos
	 * 
	 * @author Sergio Arias
	 * @date 2/05/2019
	 * @param id Id del objeto a buscar
	 * @return Objeto encontrado
	 */
	T leer(Integer id);

	/**
	 * Metodo que lista todos los datos de una entidad
	 * 
	 * @author Sergio Arias
	 * @date 2/05/2019
	 * @return Lista de objetos asociados una entidad
	 */
	List<T> listar();

	/**
	 * Metodo que elimina un objeto
	 * 
	 * @author Sergio Arias
	 * @date 2/05/2019
	 * @param id Id del objeto a eliminar
	 */
	void eliminar(Integer id);
}
