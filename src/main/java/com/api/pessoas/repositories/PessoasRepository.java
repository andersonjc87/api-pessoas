package com.api.pessoas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pessoas.entities.EntityPessoas;

@Repository
public interface PessoasRepository extends JpaRepository<EntityPessoas, Long> {


}
