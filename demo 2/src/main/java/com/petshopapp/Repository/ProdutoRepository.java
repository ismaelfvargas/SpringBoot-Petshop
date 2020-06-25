package com.petshopapp.Repository;

import com.petshopapp.models.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, String> {
}
