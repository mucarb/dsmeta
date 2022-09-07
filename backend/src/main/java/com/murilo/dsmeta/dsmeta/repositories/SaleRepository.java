package com.murilo.dsmeta.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.murilo.dsmeta.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	/*
	 * Exemplo em JPQL: SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND
	 * :max ORDER BY obj.amount DESC
	 */
	Page<Sale> findDistinctByDateBetweenOrderByAmountDesc(LocalDate min, LocalDate max, Pageable pageable);

}
