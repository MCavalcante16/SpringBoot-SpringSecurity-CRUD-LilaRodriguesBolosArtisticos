package com.ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufc.br.model.Pedido;

public interface pedidoDataBase extends JpaRepository<Pedido,Long>{
}
