package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Emiel Bloem
 * <p>
 * Dit doet het programma
 */
public class HuisjeVrijNL {
    private List<Wachter> wachters = new ArrayList<Wachter>();
    private List<Huis> huizen = new ArrayList<Huis>();

    public List<Huis> getHuizen() {
        return huizen;
    }

    public void setHuizen(Huis huis) {
        this.huizen.add(huis);
        notifyAllWachters();
    }

    public void attach(Wachter wachter) {
        wachters.add(wachter);
    }

    public void notifyAllWachters() {
        for (Wachter wachter : wachters) {
            wachter.update();
        }
    }
}





