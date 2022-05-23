package com.cadastroCliente.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastroCliente.crm.cliente.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	
	
	
}
