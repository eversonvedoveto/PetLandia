/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everson.dao;

import com.everson.model.Cliente;

/**
 *
 * @author Everson
 */
public interface ClienteDaoInterface {

    public void inserir(Cliente cliente);

    public void alterar(Cliente cliente);

    public void excluir(Cliente cliente);

}
