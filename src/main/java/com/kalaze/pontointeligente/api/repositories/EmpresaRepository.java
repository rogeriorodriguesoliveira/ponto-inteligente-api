package com.kalaze.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.kalaze.pontointeligente.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	
	/* Transactional por se tratar de um metodo só de consulta, faz apenas select ele nao precisa de trasação
	 *  e nao precisa bloquear po banco de dados ajudando na performance */
	@Transactional(readOnly = true)  
	Empresa findByCnpj(String cnpj);

}
