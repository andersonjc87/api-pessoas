package com.api.pessoas.enums;

public enum EnumPessoa {

    MASCULINO("MASCULINO"),
    FEMININO("FEMININO"),
    INDEFINIDO("INDEFINIDO"),
    OUTROS("OUTROS");

    private String sexo;

    private EnumPessoa(String sexo) {
        this.sexo = sexo;
    }

    public static EnumPessoa getByDescription(String sexo) {
        if (sexo == null)
            return null;
        for (EnumPessoa e : EnumPessoa.values()) {
            if (e.sexo.equals(sexo))
                return e;
        }
        return null;
    }

    public String getsexo() {
        return sexo;
    }

}
