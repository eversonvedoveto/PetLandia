package com.eversontcc.controller;
 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import com.eversontcc.dao.ClienteDao;
import com.eversontcc.model.Cliente;
 

 
@ManagedBean
@SessionScoped
public class ClienteMB implements Serializable{
 
	private static final long serialVersionUID = -4421730510574744692L;

	private Cliente cliente = new Cliente();
 
	private List<Cliente> clientes = new ArrayList<>(); 
 
	//construct
	public ClienteMB(){
		clientes = new ClienteDao().listar();
		cliente = new Cliente();
	}
 
	 
	public void cadastrar(ActionEvent actionEvent){
		new ClienteDao().inserir(cliente);
		clientes = new ClienteDao().listar();
		cliente = new Cliente();
	}
 
	public void alterar(ActionEvent actionEvent){
		new ClienteDao().alterar(cliente);
		clientes = new ClienteDao().listar();
		cliente = new Cliente();
	}
	public void excluir(ActionEvent actionEvent){
		new ClienteDao().excluir(cliente);
		clientes = new ClienteDao().listar();
		cliente = new Cliente();
	}
 
	//getters and setters
	
	public Cliente getCliente() {
		return cliente;
	}
 
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
 
	public List<Cliente> getClientes() {
		return clientes;
	}
 
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
}