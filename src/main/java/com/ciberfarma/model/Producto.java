package com.ciberfarma.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_productos")

public class Producto {
	@Id
	 private String id_prod ;
	 private String des_prod;
	 private int stk_prod ;
	 private Double pre_prod;
	 private int idcategoria;
	 private int est_prod ;
	private int idproveedor ;
	

}
