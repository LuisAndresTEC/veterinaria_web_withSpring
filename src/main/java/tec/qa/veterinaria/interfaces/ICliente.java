package tec.qa.veterinaria.interfaces;

import org.springframework.data.repository.CrudRepository;
import tec.qa.veterinaria.model.Cliente;
/*
Autores: Pablo Muñoz Hidalgo, Luis Andrés Rojas, Royner Miranda Segura
Clase: Aseguramiento de la Calidad de Software
ITCR 2022
 */
public interface ICliente extends CrudRepository<Cliente,Integer> {
}
