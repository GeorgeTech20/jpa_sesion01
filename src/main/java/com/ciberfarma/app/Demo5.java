package com.ciberfarma.app;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ciberfarma.model.Usuario;

public class Demo5 {
public static void main (String[] args) {
	EntityManagerFactory conexion = Persistence.createEntityManagerFactory("jpa_sesion01");
	EntityManager em = conexion.createEntityManager();
	
//proceso
	
	
	

	Usuario u = em.find(Usuario.class,6);
	
	if(u != null) {
		System.out.print("El codigo 6 existe");
		System.out.print(u);
		em.getTransaction().begin(); // reg, act, eli
		em.remove(u);
		System.out.print("Eliminacion Ok")	;
		em.getTransaction().commit();
	}
	else {
		System.out.print("El usuario no existe");
		System.out.print(u);
	}
	em.close();
	
	

}

}