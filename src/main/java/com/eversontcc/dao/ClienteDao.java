package com.eversontcc.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

import com.eversontcc.model.Cliente;
import com.eversontcc.utils.NovoHibernateUtil;

public class ClienteDao {

	private Session session;

	public void inserir(Cliente cliente) {
		session = NovoHibernateUtil.getSessionFactory().openSession();

		try {
			session.beginTransaction();
			session.save(cliente);
			session.getTransaction().commit();

		} finally {
			session.close();

		}
	}

	public void alterar(Cliente cliente) {
		session = NovoHibernateUtil.getSessionFactory().openSession();

		try {
			session = NovoHibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(cliente);
			session.getTransaction().commit();
		} finally {
			session.close();

		}
	}

	public void excluir(Cliente cliente) {
		

		try {
			session = NovoHibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(cliente);
			session.getTransaction().commit();

		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();

		}
	}

	public List<Cliente> listar() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		session = NovoHibernateUtil.getSessionFactory().openSession();
	
		try {
			clientes = session.createQuery("from Cliente").list();
			
		} catch (RuntimeException e) {
			 e.printStackTrace();
			 } finally {
			 session.flush();
			 session.close();
			 }
			 return clientes;
	}
	
}