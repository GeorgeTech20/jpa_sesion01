package com.ciberfarma.app;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ciberfarma.model.Producto;

public class Demo1v2 {
public static void main (String[] args) {
	EntityManagerFactory conexion = Persistence.createEntityManagerFactory("jpa_sesion01");
	EntityManager em = conexion.createEntityManager();
	
//proceso
	
	
	

	Producto p = new Producto();
	p.setId_prod("P0023");
	p.setDes_prod("Moras");
	p.setStk_prod(2);
	p.setPre_prod(2.5);
	p.setIdcategoria(2);
	p.setEst_prod(1);
	p.setIdproveedor(1);
	
	try {
	em.getTransaction().begin(); // reg, act, eli
	em.persist(p);
	System.out.print("Registro Ok");
	em.getTransaction().commit();
	} catch (Exception e) 	{
		System.out.print("Error al Registrar: " + e.getMessage());
		// TODO: handle exception
	}
}

}