package com.devsuperior.hrpayroll.entities;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Worker implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Double dailyIncome;
}
