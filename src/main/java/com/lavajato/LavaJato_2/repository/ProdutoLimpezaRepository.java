package com.lavajato.LavaJato_2.repository;

import com.lavajato.LavaJato_2.entities.ProdutoLimpeza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoLimpezaRepository extends JpaRepository<ProdutoLimpeza, Integer> {
}