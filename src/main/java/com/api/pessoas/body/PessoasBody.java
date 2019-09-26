package com.api.pessoas.body;

import java.time.LocalDate;

import com.api.pessoas.entities.EntityPessoas;
import com.api.pessoas.enums.EnumPessoa;
import com.api.pessoas.enums.EnumStatus;

public class PessoasBody {

    private Long idPessoa;

    private String nome;

    private Long cpf;

    private EnumPessoa sexo;

    private LocalDate dataCriacao;

    private LocalDate dataAlteracao;

    private EnumStatus status;

    public PessoasBody(EntityPessoas apiPessoas) {
        this.idPessoa = apiPessoas.getIdPessoas();
        this.nome = apiPessoas.getNome();
        this.cpf = apiPessoas.getCpf();
        this.sexo = apiPessoas.getSexo();
        this.dataCriacao = apiPessoas.getDataCriacao();
        this.dataAlteracao = apiPessoas.getDataAlteracao();
        this.status = apiPessoas.getStatus();
    }

    public Long getIdPessoas() {
        return idPessoa;
    }

    public void setApiPessoas(Long apiPessoas) {
        this.idPessoa = apiPessoas;
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PessoasBody [idPessoa=");
        builder.append(idPessoa);
        builder.append(", nome=");
        builder.append(nome);
        builder.append(", cpf=");
        builder.append(cpf);
        builder.append(", sexo=");
        builder.append(sexo);
        builder.append(", dataCriacao=");
        builder.append(dataCriacao);
        builder.append(", dataAlteracao=");
        builder.append(dataAlteracao);
        builder.append(", status=");
        builder.append(status);
        builder.append("]");
        return builder.toString();
    }

}
