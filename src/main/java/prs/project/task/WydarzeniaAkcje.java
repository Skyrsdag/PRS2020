package prs.project.task;

import lombok.Getter;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Getter
public enum WydarzeniaAkcje {

    WYCOFANIE,
    PRZYWROCENIE,
    INWENTARYZACJA,
    RAPORT_SPRZEDAZY;

    @JsonCreator
    public static WydarzeniaAkcje forValue(String value) {
        return WydarzeniaAkcje.valueOf(value);
    }

    @JsonValue
    public String toValue() {
        return this.toString();
    }

}
