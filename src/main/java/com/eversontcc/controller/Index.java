package com.eversontcc.controller;



import javax.faces.bean.ManagedBean;

@ManagedBean
public class Index {
	
	public Index(){
		mudaPagina();
	}
	
	public String mudaPagina(){
		return "cliente2.xhtml";
	}
	

}
