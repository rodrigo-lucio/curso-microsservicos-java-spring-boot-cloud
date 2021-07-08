package com.devsuperior.hroauth.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Role implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	
	@EqualsAndHashCode.Include
	private String roleName;

}
