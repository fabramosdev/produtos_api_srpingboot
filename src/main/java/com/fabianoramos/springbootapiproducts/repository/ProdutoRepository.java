package com.fabianoramos.springbootapiproducts.repository;

import com.fabianoramos.springbootapiproducts.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
