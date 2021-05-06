package com.projetospring.psvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.psvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
