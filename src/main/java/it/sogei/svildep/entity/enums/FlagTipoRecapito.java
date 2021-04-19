package it.sogei.svildep.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FlagTipoRecapito {

    TRT("Telefono"),
    TRE("Email"),
    TRP("Pec");

    public String descrizione;
}
