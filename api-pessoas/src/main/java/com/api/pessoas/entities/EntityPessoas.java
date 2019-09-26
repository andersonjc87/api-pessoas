package com.api.pessoas.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.api.pessoas.enums.EnumPessoa;
import com.api.pessoas.enums.EnumStatus;

@Entity
@Table(name = "tb_pessoa")
public class EntityPessoas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PESSOA_ID")
    private Long idPessoas;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "CPF")
    private Long cpf;

    @Column(name = "SEXO")
    private EnumPessoa sexo;

    @Column(name = "DATA_CRIACAO")
    private LocalDate dataCriacao;

    @Column(name = "DATA_ALTERACAO")
    private LocalDate dataAlteracao;

    @Column(name = "STATUS")
    private EnumStatus status;

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDate dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }

    public Long getIdPessoas() {
        return idPessoas;
    }

    public void setIdPessoas(Long idPessoas) {
        this.idPessoas = idPessoas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public EnumPessoa getSexo() {
        return sexo;
    }

    public void setSexo(EnumPessoa sexo) {
        this.sexo = sexo;
    }

}
