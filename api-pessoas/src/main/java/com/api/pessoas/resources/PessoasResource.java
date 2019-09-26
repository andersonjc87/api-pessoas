package com.api.pessoas.resources;

import java.time.LocalDate;

import javax.naming.NotContextException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.pessoas.body.PessoasBody;
import com.api.pessoas.entities.EntityPessoas;
import com.api.pessoas.enums.EnumStatus;
import com.api.pessoas.services.PessoasService;

@RestController
@RequestMapping(path = "/api")
public final class PessoasResource {

    @Autowired
    private PessoasService pessoasService;

    @ResponseBody
    @GetMapping(path = "/pessoas")
    public ResponseEntity<?> getAllPeople(Pageable pageable) {

        Page<PessoasBody> people = pessoasService.getAll(pageable);

        if (people == null) {
            return ResponseEntity.noContent()
                    .build();
        }
        return ResponseEntity.ok(people);

    }

    @ResponseBody
    @GetMapping(path = "/pessoas/{id}")
    public ResponseEntity<?> getId(@PathVariable("id") Long id) {

        EntityPessoas pessoa = pessoasService.getId(id);

        if (pessoa == null) {
            return ResponseEntity.noContent()
                    .build();
        }

        return ResponseEntity.ok(pessoa);

    }

    @RequestMapping
    @DeleteMapping(path = "/pessoas/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) throws NotContextException {

        pessoasService.delete(id);
        return ResponseEntity.status(200).build();
    }

    @PutMapping(path = "/pessoas/{id}", consumes = "application/json")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody PessoasBody body) {

        EntityPessoas pessoa = pessoasService.update(body);

        if (pessoa == null) {
            return ResponseEntity.noContent()
                    .build();
        }

        return ResponseEntity.ok(pessoa);
    }

    @PutMapping(path = "/pessoas", consumes = "application/json")
    public ResponseEntity<?> create(@RequestBody PessoasBody body) {

        try {
            body.setDataCriacao(LocalDate.now());
            body.setDataAlteracao(LocalDate.now());
            body.setStatus(EnumStatus.ATIVO);
            return ResponseEntity.ok(pessoasService.update(body));

        } catch (Exception e) {

            return ResponseEntity.status(500).build();
        }

    }
}
