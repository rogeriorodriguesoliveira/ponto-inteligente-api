package com.kalaze.pontointeligente.api.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.kalaze.pontointeligente.api.entities.Lancamento;

public interface LancamentoService {
	
	/**
	 * Retorna uma lista paginada de lançamentos de um determinado funcionario.
	 * 
	 * @param funcionarioId
	 * @param pageRequest
	 * @return Page<Lancamento>
	 */
	Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);
	
	/**
	 * Retona um lançamento por ID.
	 * 
	 * @param id
	 * @return Optional<Lancamento>
	 */
	Optional<Lancamento> buscarPorId(Long id);
	
	/**
	 * Persiste um lancamento na base de dados
	 * 
	 * @param lancamento
	 * @return Lacamento
	 */
	Lancamento persistir(Lancamento lacamento);
	
	/**
	 * Remove um lacamento da base de dados
	 * 
	 * @param id
	 */
	void remover(Long id);
	
	

}
