package prs.project.task;

import org.assertj.core.util.Sets;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Getter
public enum Wydarzenia {

    WYCOFANIE(Arrays.asList(WydarzeniaAkcje.WYCOFANIE, WydarzeniaAkcje.PRZYWROCENIE)),
    INWENTARYZACJA(Arrays.asList(WydarzeniaAkcje.INWENTARYZACJA)),
    RAPORT_SPRZEDAZY(Arrays.asList(WydarzeniaAkcje.RAPORT_SPRZEDAZY));

    Set<WydarzeniaAkcje> akceptowane;

    Wydarzenia(List<WydarzeniaAkcje> types) {
        this.akceptowane = Sets.newHashSet(types);
    }
}
