package com.petshopapp.Repository;

import org.springframework.data.repository.CrudRepository;
import com.petshopapp.models.Cliente;

//CrudRepository - instanciar e utilizar metodos já prontos, como update, deletar, alterar..
public interface ClienteRepository extends CrudRepository<Cliente, String> {


}
