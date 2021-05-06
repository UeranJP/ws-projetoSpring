package com.projetospring.psvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.psvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
