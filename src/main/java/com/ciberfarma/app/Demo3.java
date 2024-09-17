package com.ciberfarma.app;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ciberfarma.model.Usuario;

public class Demo3 {
public static void main (String[] args) {
	EntityManagerFactory conexion = Persistence.createEntityManagerFactory("jpa_sesion01");
	EntityManager em = conexion.createEntityManager();
	
//proceso
	
	
	

	Usuario u = new Usuario();
	
	u.setNom_usua("Miguel");
	u.setApe_usua("Minaya");
	u.setCorreo("aminaya@mail.com");
	u.setClave("12345");
	u.setFna_usua("2000/10/05");
	u.setIdtipo(2);
	u.setEst_usua(1);
	
	try {
	em.getTransaction().begin(); // reg, act, eli
	em.remove(u);
	System.out.print("Eliminacion Ok")	;
	em.getTransaction().commit();
	} catch (Exception e) 	{
		System.out.print("Error al Eliminar: " + e.getMessage());
		// TODO: handle exception
	}
}

}