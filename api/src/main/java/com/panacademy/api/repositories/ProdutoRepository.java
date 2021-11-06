package com.panacademy.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.panacademy.api.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Double> {

}