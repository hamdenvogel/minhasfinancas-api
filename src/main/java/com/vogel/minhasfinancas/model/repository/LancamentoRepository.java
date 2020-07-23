package com.vogel.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vogel.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
