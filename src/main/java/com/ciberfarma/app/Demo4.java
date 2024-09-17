package com.ciberfarma.app;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ciberfarma.model.Usuario;

public class Demo4 {
public static void main (String[] args) {
	EntityManagerFactory conexion = Persistence.createEntityManagerFactory("jpa_sesion01");
	EntityManager em = conexion.createEntityManager();
	
//proceso
	
	
	

	Usuario u = em.find(Usuario.class,6);
	
	if(u != null) {
		System.out.print("El codigo 6 existe");
		System.out.print(u);
	}
	else {
		System.out.print("El usuario no existe");
		System.out.print(u);
	}
	em.close();
	
	

}

}