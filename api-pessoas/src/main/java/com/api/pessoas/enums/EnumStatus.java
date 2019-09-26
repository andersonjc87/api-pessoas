package com.api.pessoas.enums;

public enum EnumStatus {

    ATIVO("ATIVO"),
    INATIVO("INATIVO");

    private String status;

    private EnumStatus(String status) {
        this.status = status;
    }

    public static EnumStatus getStatus(String status) {
        if (status == null)
            return null;
        for (EnumStatus e : EnumStatus.values()) {
            if (e.status.equals(status))
                return e;
        }
        return null;
    }

    public String getStatus() {
        return status;
    }

}