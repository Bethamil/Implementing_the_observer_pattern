package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Emiel Bloem
 * <p>
 * Dit doet het programma
 */
public class HuisjeVrijNL {
    private final List<Toerist> toeristen = new ArrayList<>();
    private final List<Huis> huizen = new ArrayList<>();

    public List<Huis> getHuizen() {
        return huizen;
    }

    public void setHuizen(Huis huis) {
        this.huizen.add(huis);
        notifyAllWachters();
    }

    public void attach(Toerist wachter) {
        toeristen.add(wachter);
    }

    public void notifyAllWachters() {
        for (Toerist wachter : toeristen) {
            wachter.update();
        }
    }
}





