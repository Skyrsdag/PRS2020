package prs.project.controllers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "ustawienia")
@Component
@Getter
@Setter
public class Settings {

    private String wycena="CENA_ZMIENNA";
    private String zamowienia="REZERWACJE";
    private String zaopatrzenie="POJEDYNCZE";
    private String wydarzenia="RAPORT_SPRZEDAŻY";
    private Long numerIndeksu=Long.valueOf(461010);
    private Long liczbaZadan=Long.valueOf(200);
}
