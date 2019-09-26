package com.api.pessoas.services;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.pessoas.body.PessoasBody;
import com.api.pessoas.entities.EntityPessoas;
import com.api.pessoas.repositories.PessoasRepository;

@Service
public class PessoasService {

    @Autowired
    private PessoasRepository pessoasRepository;

    public Page<PessoasBody> getAll(Pageable pageable) {
        Page<EntityPessoas> pessoa = pessoasRepository.findAll(pageable);
        return pessoa.map(pessoas -> new PessoasBody(pessoas));
    }

    public EntityPessoas getId(Long id) {
        Optional<EntityPessoas> subEmitterOp = pessoasRepository.findById(id);

        if (subEmitterOp.isPresent()) {
            return subEmitterOp.get();
        }

        return null;
    }

    public EntityPessoas delete(Long id) {
        pessoasRepository.deleteById(id);

        Optional<EntityPessoas> pessoas = pessoasRepository.findById(id);

        return null;

    }

    public EntityPessoas update(PessoasBody body) {
        return this.pessoasRepository.save(convertEntity(body));
    }

    public EntityPessoas convertEntity(PessoasBody body) {

        EntityPessoas entity = new EntityPessoas();

        entity.setIdPessoas(body.getIdPessoas());
        entity.setNome(body.getNome());
        entity.setCpf(body.getCpf());
        entity.setSexo(body.getSexo());
        entity.setDataCriacao(LocalDate.now());
        entity.setDataAlteracao(LocalDate.now());
        entity.setStatus(body.getStatus());

        return entity;
    }

}
