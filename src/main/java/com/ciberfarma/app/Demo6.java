package com.ciberfarma.app;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ciberfarma.model.Usuario;

public class Demo6 {
public static void main (String[] args) {
	EntityManagerFactory conexion = Persistence.createEntityManagerFactory("jpa_sesion01");
	EntityManager em = conexion.createEntityManager();
	

	String sql="select * from tb_usuarios";
	String jpql = "select u from Usuario u";
	//String jpql = "select u.nom_usua, u.ap"
			
			
		List<Usuario> lstUsuarios = em.createQuery(jpql,Usuario.class).getResultList();
		
		System.out.print("----Listado de Usuarios----");
		System.out.print("---------------------------");
		for (Usuario u  : lstUsuarios) {
			//System.out.print(u);
			System.out.println("COdigo : " + u.getCod_usua());
			System.out.println("Nombre : " + u.getNom_usua() + " " + u.getApe_usua());
			System.out.println("Tipo : " + u.getIdtipo());
			System.out.println("Tipo : " + u.getObtTipo().getDescripcion());
			System.out.println("-------------------------");
			
		}
	
	

	
	em.close();
	
	

}

}